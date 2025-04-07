package com.advance.csv_to_object;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "students.csv";
        StudentCSVReader reader = new StudentCSVReader();
        List<Student> students = reader.readStudentsFromCSV(filePath);

        // Print the Student objects
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
