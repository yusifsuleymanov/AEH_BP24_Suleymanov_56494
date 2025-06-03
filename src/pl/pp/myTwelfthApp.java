package pl.pp;

import java.io.*;
import java.util.Scanner;

public class myTwelfthApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File inputFile;

        // Ask the user for a valid input file path
        while (true) {
            System.out.print("Please enter the path to the input file: ");
            String inputPath = scanner.nextLine();
            inputFile = new File(inputPath);

            if (inputFile.exists()) {
                break;
            } else {
                System.out.println("File not found. Please try again.");
            }
        }

        // Ask the user for the output file path
        System.out.print("Please enter the path to the output file: ");
        String outputPath = scanner.nextLine();

        // Perform file operations
        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputPath))
        ) {
            int lineCount = 0;
            while (reader.readLine() != null) {
                lineCount++;
            }

            // Display result on console
            System.out.println("Number of lines in the input file: " + lineCount);

            // Write result to output file
            writer.write("Input File Name: " + inputFile.getName() + "\n");
            writer.write("Line Count: " + lineCount + "\n");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }

        scanner.close();
    }
}
