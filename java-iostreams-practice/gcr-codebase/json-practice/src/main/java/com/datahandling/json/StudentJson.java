package com.datahandling.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

public class StudentJson {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode student = mapper.createObjectNode();
        student.put("name", "Tanisha");
        student.put("age", 22);

        ArrayNode subjects = mapper.createArrayNode();
        subjects.add("Java");
        subjects.add("Spring");
        subjects.add("SQL");

        student.set("subjects", subjects);

        System.out.println(student.toPrettyString());
    }
}

