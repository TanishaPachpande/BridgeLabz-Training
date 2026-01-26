package com.datahandling.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ValidateRunner {
    public static void main(String[] args) throws Exception {

        String json = """
        {
          "name": "Tanisha",
          "age": 22,
          "email": "tanisha@gmail.com"
        }
        """;

        ObjectMapper mapper = new ObjectMapper();
        JsonNode node = mapper.readTree(json);

        if (JsonValidation.isValid(node)) {
            System.out.println("JSON structure is valid");
        } else {
            System.out.println("Invalid JSON structure");
        }
    }
}

