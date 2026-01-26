package com.datahandling.json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;

import java.util.Set;

public class EmailValidation {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        String schemaStr = """
                {
                  "$schema": "http://json-schema.org/draft-07/schema#",
                  "type": "object",
                  "properties": {
                    "email": {
                      "type": "string",
                      "format": "email"
                    }
                  },
                  "required": ["email"]
                }
                """;

        String jsonData = """
                {
                  "email": "test@example.com"
                }
                """;

        JsonSchemaFactory factory =
                JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V7);

        JsonSchema schema = factory.getSchema(schemaStr);

        JsonNode jsonNode = mapper.readTree(jsonData);

        Set<ValidationMessage> errors = schema.validate(jsonNode);

        if (errors.isEmpty()) {
            System.out.println("Email is VALID");
        } else {
            System.out.println("Email is INVALID");
            errors.forEach(error -> System.out.println(error.getMessage()));
        }
    }
}

