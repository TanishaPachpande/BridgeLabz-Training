package com.stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteStudentData {

    public static void main(String[] args) {

        try (
            DataOutputStream dos = new DataOutputStream(
                new FileOutputStream("student.dat")
            )
        ) {

            int rollNumber = 101;
            String name = "Tanisha";
            double gpa = 8.75;

            dos.writeInt(rollNumber);
            dos.writeUTF(name);
            dos.writeDouble(gpa);

            System.out.println("Student data written successfully.");

        } catch (IOException e) {
            System.out.println("Error while writing data.");
            e.printStackTrace();
        }
    }
}

