package com.datahandling.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import java.util.*;
import java.util.stream.Collectors;

class Person {
    private String name;
    private int age;

    public Person() {} 
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
}

public class FilterJson {
    public static void main(String[] args) throws Exception {
        String jsonArray = "[{\"name\":\"Alice\",\"age\":25},{\"name\":\"Bob\",\"age\":30},{\"name\":\"Charlie\",\"age\":28}]";

        ObjectMapper mapper = new ObjectMapper();

        List<Person> people = mapper.readValue(jsonArray, new TypeReference<List<Person>>() {});

        List<Person> filtered = people.stream()
                                      .filter(p -> p.getAge() > 25)
                                      .collect(Collectors.toList());

        String filteredJson = mapper.writeValueAsString(filtered);
        System.out.println(filteredJson);
    }
}

