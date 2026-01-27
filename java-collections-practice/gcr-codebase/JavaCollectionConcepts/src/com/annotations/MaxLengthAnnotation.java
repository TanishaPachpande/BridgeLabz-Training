package com.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface MaxLength {
    int value();
}

class UserName {

    @MaxLength(10)
    private String username;

    public UserName(String username) {
        validate(username);
        this.username = username;
    }

    private void validate(String value) {
        try {
            Field field = this.getClass().getDeclaredField("username");

            if (field.isAnnotationPresent(MaxLength.class)) {
                MaxLength maxLength = field.getAnnotation(MaxLength.class);
                int limit = maxLength.value();

                if (value.length() > limit) {
                    throw new IllegalArgumentException(
                        "Username exceeds max length of " + limit
                    );
                }
            }

        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }
}

public class MaxLengthAnnotation {

    public static void main(String[] args) {

    	UserName user1 = new UserName("Tanisha");   // Valid
        System.out.println(user1.getUsername());

        UserName user2 = new UserName("VeryLongUsername"); // Exception
    }
}

