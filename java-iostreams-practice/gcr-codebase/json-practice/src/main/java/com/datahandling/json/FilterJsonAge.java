package com.datahandling.json;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;
import java.util.stream.Collectors;

public class FilterJsonAge {

    static class User {
        public String name;
        public int age;
    }

    public static void main(String[] args) throws Exception {

        String jsonData = """
                [
                  {"name":"Alice","age":25},
                  {"name":"Bob","age":30},
                  {"name":"Charlie","age":28}
                ]
                """;

        ObjectMapper mapper = new ObjectMapper();

        List<User> users = mapper.readValue(
                jsonData,
                new TypeReference<List<User>>() {}
        );

        List<User> filteredUsers = users.stream()
                .filter(user -> user.age > 25)
                .collect(Collectors.toList());

        filteredUsers.forEach(
                user -> System.out.println("Name: " + user.name + ", Age: " + user.age)
        );
    }
}
