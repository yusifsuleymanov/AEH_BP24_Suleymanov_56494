import java.util.Scanner;

public class AgelnSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter their age
        System.out.print("Please enter your age in years: ");
        int age = scanner.nextInt();

        // Converting age to seconds (1 year = 365 days, 1 day = 24 hours, 1 hour = 60 minutes, 1 minute = 60 seconds)
        long ageInSeconds = (long) age * 365 * 24 * 60 * 60;

        // Displaying the age in seconds
        System.out.println("Your age in seconds: " + ageInSeconds + " seconds");

        // Closing the scanner
        scanner.close();
    }
}
