package pl.pp;

import java.util.Scanner;

public class myFifthApp {

    // This method prints the given character in rows and columns
    public static void draw(char character, int repeat, int lines) {
        for (int i = 0; i < lines; i++) {
            for (int j = 0; j < repeat; j++) {
                System.out.print(character);
            }
            System.out.println(); // end of line
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        System.out.print("Enter how many times to repeat in a row: ");
        int repeat = scanner.nextInt();

        System.out.print("Enter how many lines to print: ");
        int lines = scanner.nextInt();

        // Print the pattern
        System.out.println("\nOutput:");
        draw(ch, repeat, lines);

        scanner.close();
    }
}
