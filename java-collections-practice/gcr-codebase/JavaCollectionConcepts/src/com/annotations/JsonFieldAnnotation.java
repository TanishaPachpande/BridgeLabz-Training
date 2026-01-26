package com.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.reflect.Field;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@interface JsonField {
    String name();
}

class User {

    @JsonField(name = "user_name")
    private String username;

    @JsonField(name = "user_age")
    private int age;

    private String password; // Not annotated → should NOT appear in JSON

    public User(String username, int age, String password) {
        this.username = username;
        this.age = age;
        this.password = password;
    }
}

class JsonSerializer {

    public static String toJson(Object obj) {
        StringBuilder json = new StringBuilder();
        json.append("{");

        Field[] fields = obj.getClass().getDeclaredFields();
        boolean firstField = true;

        for (Field field : fields) {
            if (field.isAnnotationPresent(JsonField.class)) {

                field.setAccessible(true);
                JsonField jsonField = field.getAnnotation(JsonField.class);
                String jsonKey = jsonField.name();

                try {
                    Object value = field.get(obj);

                    if (!firstField) {
                        json.append(", ");
                    }

                    json.append("\"").append(jsonKey).append("\": ");

                    if (value instanceof String) {
                        json.append("\"").append(value).append("\"");
                    } else {
                        json.append(value);
                    }

                    firstField = false;

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        json.append("}");
        return json.toString();
    }
}

public class JsonFieldAnnotation {

    public static void main(String[] args) {

        User user = new User("Tanisha", 22, "secret123");

        String json = JsonSerializer.toJson(user);
        System.out.println(json);
    }
}
