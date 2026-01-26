package com.datahandling.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class MergeJson {
    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        ObjectNode json1 = (ObjectNode) mapper.readTree(
                "{\"name\":\"Tanisha\",\"age\":22}"
        );

        ObjectNode json2 = (ObjectNode) mapper.readTree(
                "{\"email\":\"tanisha@gmail.com\",\"city\":\"Pune\"}"
        );

        json1.setAll(json2);

        System.out.println(json1.toPrettyString());
    }
}

