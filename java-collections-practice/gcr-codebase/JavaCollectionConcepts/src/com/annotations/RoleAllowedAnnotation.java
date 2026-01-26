package com.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface RoleAllowed {
    String value();
}

class UserContext {
    static String currentRole;
}

class AdminService {

    @RoleAllowed("ADMIN")
    public void performAdminTask() {
        System.out.println("Admin task executed successfully!");
    }
}

class AccessValidator {

    public static void invoke(Method method, Object obj) throws Exception {

        if (method.isAnnotationPresent(RoleAllowed.class)) {
            RoleAllowed roleAllowed = method.getAnnotation(RoleAllowed.class);
            String requiredRole = roleAllowed.value();

            if (!requiredRole.equals(UserContext.currentRole)) {
                System.out.println("Access Denied!");
                return;
            }
        }

        method.invoke(obj);
    }
}

public class RoleAllowedAnnotation {

    public static void main(String[] args) throws Exception {

        AdminService service = new AdminService();
        Method method = AdminService.class.getMethod("performAdminTask");

        UserContext.currentRole = "ADMIN";
        AccessValidator.invoke(method, service);

        UserContext.currentRole = "USER";
        AccessValidator.invoke(method, service);
    }
}

