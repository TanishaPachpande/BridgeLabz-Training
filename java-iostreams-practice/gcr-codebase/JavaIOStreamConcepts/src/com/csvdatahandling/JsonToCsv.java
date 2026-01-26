package com.csvdatahandling;

import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToCsv {

    public static void main(String[] args) throws Exception {

        ObjectMapper mapper = new ObjectMapper();

        // Read JSON file
        List<Map<String, Object>> students =
                mapper.readValue(new File("students.json"), List.class);

        FileWriter writer = new FileWriter("students.csv");

        // Write header
        writer.append("id,name,age,marks\n");

        // Write data
        for (Map<String, Object> student : students) {
            writer.append(student.get("id") + ",");
            writer.append(student.get("name") + ",");
            writer.append(student.get("age") + ",");
            writer.append(student.get("marks") + "\n");
        }

        writer.close();
        System.out.println("JSON converted to CSV successfully");
    }
}

