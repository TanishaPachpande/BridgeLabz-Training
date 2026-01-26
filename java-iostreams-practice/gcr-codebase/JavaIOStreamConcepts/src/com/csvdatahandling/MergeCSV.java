package com.csvdatahandling;

import java.io.*;
import java.util.*;

public class MergeCSV {
    public static void main(String[] args) throws Exception {
        Map<String, String[]> map = new HashMap<>();

        BufferedReader br1 = new BufferedReader(new FileReader("students1.csv"));
        br1.readLine();
        String line;
        while ((line = br1.readLine()) != null) {
            String[] v = line.split(",");
            map.put(v[0], v);
        }

        BufferedReader br2 = new BufferedReader(new FileReader("students2.csv"));
        br2.readLine();
        FileWriter fw = new FileWriter("students_merged.csv");
        fw.write("ID,Name,Age,Marks,Grade\n");

        while ((line = br2.readLine()) != null) {
            String[] v2 = line.split(",");
            String[] v1 = map.get(v2[0]);
            fw.write(v1[0] + "," + v1[1] + "," + v1[2] + "," + v2[1] + "," + v2[2] + "\n");
        }

        fw.close();
    }
}
