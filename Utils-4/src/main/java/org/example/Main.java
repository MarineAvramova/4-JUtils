package org.example;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the path of the TXT file to read:");
        String filePath = scanner.nextLine();

        DirectoryReader.readTxtFile(filePath);
    }
}
