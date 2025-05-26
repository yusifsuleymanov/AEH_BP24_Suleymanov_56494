package pl.pp;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select operation:");
            System.out.println("a) add");
            System.out.println("s) subtract");
            System.out.println("m) multiply");
            System.out.println("d) divide");
            System.out.println("q) quit");
            System.out.print("> ");

            String choice = scanner.next();

            if (choice.equals("q")) {
                System.out.println("Exiting...");
                break;
            }

            if (!choice.matches("[asmd]")) {
                System.out.println("Invalid option. Try again.\n");
                continue;
            }

            System.out.print("Enter first number: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Enter a number: ");
                scanner.next();
            }
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Invalid input. Enter a number: ");
                scanner.next();
            }
            double num2 = scanner.nextDouble();

            switch (choice) {
                case "a":
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case "s":
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case "m":
                    System.out.println("Result: " + (num1 * num2));
                    break;
                case "d":
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero!");
                    } else {
                        System.out.println("Result: " + (num1 / num2));
                    }
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }
}
