package com.advance.json_csv;

public class Main {
    public static void main(String[] args) throws Exception {
        JsonCsvConverter converter = new JsonCsvConverter();
        
        // File paths
        String jsonFilePath = "students.json";
        String csvFilePath = "students.csv";
        String backToJsonFilePath = "students_back.json";

        // Convert JSON to CSV
        converter.jsonToCsv(jsonFilePath, csvFilePath);

        // Convert CSV to JSON
        converter.csvToJson(csvFilePath, backToJsonFilePath);
    }
}

