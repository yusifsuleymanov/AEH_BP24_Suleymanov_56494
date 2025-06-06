package pl.pp;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class WordCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputFilePath;
        String outputFilePath;

        // Step 1: Get valid input file path
        while (true) {
            System.out.print("Enter the input file path: ");
            inputFilePath = scanner.nextLine();

            if (Files.exists(Paths.get(inputFilePath))) {
                break;
            } else {
                System.out.println("Input file does not exist. Please try again.");
            }
        }

        // Step 2: Get output file path
        System.out.print("Enter the output file path: ");
        outputFilePath = scanner.nextLine();

        // Step 3: Read file and count words
        Map<String, Integer> wordCounts = new TreeMap<>(); // Sorted alphabetically
        int totalWords = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Remove punctuation, convert to lowercase, and split into words
                String[] words = line.replaceAll("[^a-zA-Z0-9 ]", "")
                        .toLowerCase()
                        .split("\\s+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        totalWords++;
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
            return;
        }

        // Step 4: Display results to console
        System.out.println("\nTotal words: " + totalWords);
        System.out.println("\nWord occurrences:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Step 5: Write results to output file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            writer.write("Input file: " + inputFilePath + "\n");
            writer.write("Total words: " + totalWords + "\n");
            writer.write("Word occurrences:\n");
            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue() + "\n");
            }
            System.out.println("\nResults saved to: " + outputFilePath);
        } catch (IOException e) {
            System.out.println("Error writing the output file: " + e.getMessage());
        }
    }
}
