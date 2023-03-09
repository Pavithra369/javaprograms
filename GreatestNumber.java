//write a java program to Take three numbers from the user and print the greatest number

import java.util.Scanner;

public class GreatestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();

        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }

        System.out.println("The greatest number is " + max);
    }
}
//output:
//Enter the first number: 3
//Enter the second number: 6
//Enter the third number: 9
//The greatest number is 9
