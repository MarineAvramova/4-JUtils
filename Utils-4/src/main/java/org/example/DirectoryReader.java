package org.example;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;

public class DirectoryReader {
    public static void readTxtFile(String filePath) {
        File inputFile = new File(filePath);
        if (!inputFile.exists() || inputFile.isDirectory()) {
            System.err.println("The specified path is not a valid file.");
            return;
        }

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
