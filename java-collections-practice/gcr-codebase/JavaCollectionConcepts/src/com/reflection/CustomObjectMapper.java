package com.reflection;

import java.lang.reflect.Field;
import java.util.Map;

public class CustomObjectMapper {

    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {

        T obj = clazz.getDeclaredConstructor().newInstance();

        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            String fieldName = entry.getKey();
            Object value = entry.getValue();

            Field field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(obj, value);
        }

        return obj;
    }
}

