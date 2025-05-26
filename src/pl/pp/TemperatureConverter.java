import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;

        while (true) {
            System.out.println("Enter temperature in Celsius (-1 to quit):");
            celsius = scanner.nextDouble();
            if (celsius == -1) {
                System.out.println("Goodbye.");
                break;
            }

            double fahrenheit = 1.8 * celsius + 32;
            double kelvin = celsius + 273.16;
            System.out.printf("Celsius: %.2f, Fahrenheit: %.2f, Kelvin: %.2f\n", celsius, fahrenheit, kelvin);
        }

        scanner.close();
    }
}
