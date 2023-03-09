import java.util.Scanner;

public class Floatingpoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Round the numbers to three decimal places
        double num1Rounded = Math.round(num1 * 1000.0) / 1000.0;
        double num2Rounded = Math.round(num2 * 1000.0) / 1000.0;

        // Test if the rounded numbers are equal
        if (num1Rounded == num2Rounded) {
            System.out.println("The two numbers are equal up to three decimal places.");
        } else {
            System.out.println("The two numbers are not equal up to three decimal places.");
        }
    }
}