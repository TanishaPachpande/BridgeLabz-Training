package com.csvdatahandling;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.*;
import java.util.*;

public class CsvToJson {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("students.csv"));
        String[] headers = br.readLine().split(",");

        List<Map<String, String>> studentList = new ArrayList<>();
        String line;

        while ((line = br.readLine()) != null) {
            String[] values = line.split(",");
            Map<String, String> student = new LinkedHashMap<>();

            for (int i = 0; i < headers.length; i++) {
                student.put(headers[i], values[i]);
            }
            studentList.add(student);
        }

        br.close();

        ObjectMapper mapper = new ObjectMapper();
        mapper.writerWithDefaultPrettyPrinter()
              .writeValue(new File("students_converted.json"), studentList);

        System.out.println("CSV converted to JSON successfully");
    }
}

