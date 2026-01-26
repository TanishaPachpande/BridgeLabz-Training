package com.csvdatahandling;

import java.io.*;
import java.util.regex.*;

public class ValidateCSV {
    public static void main(String[] args) throws Exception {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        String phoneRegex = "\\d{10}";

        Pattern emailPattern = Pattern.compile(emailRegex);
        Pattern phonePattern = Pattern.compile(phoneRegex);

        BufferedReader br = new BufferedReader(new FileReader("users.csv"));
        br.readLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] v = line.split(",");
            boolean valid = true;

            if (!emailPattern.matcher(v[2]).matches()) {
                System.out.println("Invalid Email: " + line);
                valid = false;
            }
            if (!phonePattern.matcher(v[3]).matches()) {
                System.out.println("Invalid Phone: " + line);
                valid = false;
            }
        }
    }
}

