//java Program to input 5 numbers from keyboard and find their sum and average.

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
//output:
//Enter the first number: 2
//Enter the second number: 3
//Enter the third number: 4
//Enter the fourth number: 5
//Enter the fifth number: 6
//Sum of the numbers is: 20.0
//Average of the numbers is: 4.0
