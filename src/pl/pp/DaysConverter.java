import java.util.Scanner;

public class DaysConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days;

        while (true) {
            System.out.println("Enter number of days (0 or less to quit):");
            days = scanner.nextInt();
            if (days <= 0) {
                System.out.println("Exiting...");
                break;
            }

            int weeks = days / 7;
            int rest = days % 7;
            System.out.println(days + " days = " + weeks + " weeks and " + rest + " days");
        }

        scanner.close();
    }
}

