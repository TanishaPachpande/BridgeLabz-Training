package com.reflection;

import java.lang.reflect.Field;

class Configuration {
    private static String API_KEY = "OLD_KEY";
}

public class ModifyStaticField {

    public static void main(String[] args) throws Exception {

        Class<Configuration> clazz = Configuration.class;

        Field field = clazz.getDeclaredField("API_KEY");
        field.setAccessible(true);

        field.set(null, "NEW_API_KEY_123");

        String updatedKey = (String) field.get(null);
        System.out.println("Updated API Key: " + updatedKey);
    }
}

