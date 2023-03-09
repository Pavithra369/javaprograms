import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5;
        double sum, average;

        System.out.print("Enter the first number: ");
        num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        num3 = input.nextInt();

        System.out.print("Enter the fourth number: ");
        num4 = input.nextInt();

        System.out.print("Enter the fifth number: ");
        num5 = input.nextInt();

        sum = num1 + num2 + num3 + num4 + num5;
        average = sum / 5;

        System.out.println("Sum of the numbers is: " + sum);
        System.out.println("Average of the numbers is: " + average);
    }
}