package com.xworks.practice.assign;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Printer {

    public static void main(String[] args) {
        String filePath = "/practice/src/com/xworks/practice/assign/info.txt"; 

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
