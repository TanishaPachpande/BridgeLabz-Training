package com.datahandling.json;

import com.fasterxml.jackson.databind.JsonNode;

public class JsonValidation {

    public static boolean isValid(JsonNode node) {

        if (node == null) {
            return false;
        }

        if (!node.has("name") || !node.get("name").isTextual()) {
            return false;
        }

        if (!node.has("age") || !node.get("age").isInt()) {
            return false;
        }

        if (!node.has("email") || !node.get("email").isTextual()) {
            return false;
        }

        return true;
    }
}

