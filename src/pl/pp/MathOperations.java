import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        double x = 10; // Define variable x and assign 10
        double y = 2;  // Define variable y and assign 2

        // Using Scanner to get user input
        Scanner scanner = new Scanner(System.in);

        // Addition
        double result = x + y;
        System.out.println("x + y = " + result);

        // Subtraction
        result = x - y;
        System.out.println("x - y = " + result);

        // Multiplication
        result = x * y;
        System.out.println("x * y = " + result);

        // Division
        result = x / y;
        System.out.println("x / y = " + result);

        // Modulo operation
        result = x % y;
        System.out.println("x % y = " + result);

        // Asking user for two numbers
        System.out.println("Enter two numbers separated by the Enter key:");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();

        // Displaying the sum of user input values
        System.out.println("The sum of the numbers you entered: " + (first + second));

        // Closing the scanner
        scanner.close();
    }
}
