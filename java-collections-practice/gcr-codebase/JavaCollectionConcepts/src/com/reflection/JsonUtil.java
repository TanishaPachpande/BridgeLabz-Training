package com.reflection;

import java.lang.reflect.Field;

public class JsonUtil {

    public static String toJson(Object obj) throws IllegalAccessException {

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        StringBuilder json = new StringBuilder("{");

        for (Field field : fields) {
            field.setAccessible(true);
            json.append("\"")
                .append(field.getName())
                .append("\":\"")
                .append(field.get(obj))
                .append("\",");
        }

        json.deleteCharAt(json.length() - 1);
        json.append("}");

        return json.toString();
    }
}

