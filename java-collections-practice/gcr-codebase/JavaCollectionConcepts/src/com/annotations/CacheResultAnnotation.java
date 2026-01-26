package com.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface CacheResult {
}

class MathService {

    @CacheResult
    public int expensiveSquare(int number) {
        System.out.println("Computing square for: " + number);
        return number * number;
    }
}

class CacheManager {

    private static final Map<String, Object> cache = new HashMap<>();

    public static Object invoke(Object obj, Method method, Object... args) throws Exception {

        String cacheKey = method.getName() + "_" + args[0];

        if (method.isAnnotationPresent(CacheResult.class)) {

            if (cache.containsKey(cacheKey)) {
                System.out.println("Returning cached result");
                return cache.get(cacheKey);
            }

            Object result = method.invoke(obj, args);
            cache.put(cacheKey, result);
            return result;
        }

        return method.invoke(obj, args);
    }
}

public class CacheResultAnnotation {

    public static void main(String[] args) throws Exception {

        MathService service = new MathService();
        Method method = MathService.class.getMethod("expensiveSquare", int.class);

        System.out.println(CacheManager.invoke(service, method, 5));
        System.out.println(CacheManager.invoke(service, method, 5)); // Cached
        System.out.println(CacheManager.invoke(service, method, 6));
        System.out.println(CacheManager.invoke(service, method, 6)); // Cached
    }
}

