package com.datahandling.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.util.*;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}

public class ListToJsonExample {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 25));
        people.add(new Person("Bob", 30));

        ObjectMapper mapper = new ObjectMapper();
        try {
            String jsonArray = mapper.writeValueAsString(people);
            System.out.println(jsonArray);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}

