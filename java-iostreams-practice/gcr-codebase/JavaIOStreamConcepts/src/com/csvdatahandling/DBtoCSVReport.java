package com.csvdatahandling;

import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBtoCSVReport {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String password = "mysql@123";

        String csvFile = "employee_report.csv";

        try (
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT emp_id, name, department, salary FROM employees");
            FileWriter writer = new FileWriter(csvFile)
        ) {
          
            writer.append("Employee ID,Name,Department,Salary\n");

            
            while (rs.next()) {
                writer.append(rs.getInt("emp_id") + ",");
                writer.append(rs.getString("name") + ",");
                writer.append(rs.getString("department") + ",");
                writer.append(rs.getDouble("salary") + "\n");
            }

            System.out.println("CSV Report generated successfully: " + csvFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

