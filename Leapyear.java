//write a java Program that takes a year from user and print whether that year is a leap year or not.

import java.util.Scanner;

public class Leapyear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
//output:
//Enter a year: 2024
//2024 is a leap year
