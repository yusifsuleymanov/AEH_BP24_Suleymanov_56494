import java.util.Scanner;

public class mySecondApp {
    public static void main(String[] args) {

        // Using Scanner to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Asking the user to enter their first name
        System.out.println("Please enter your first name:");
        String forename = scanner.nextLine();

        // Asking the user to enter their last name
        System.out.println("Please enter your last name:");
        String surname = scanner.nextLine();

        // Closing the scanner
        scanner.close();

        // Displaying a welcome message
        System.out.println("Welcome " + forename + " " + surname);
    }
}