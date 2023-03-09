//write a java  Program that keeps a number from the user and generates an integer between 1 and 7 and displays the name of the weekday.

import java.util.Scanner;

public class WeekdayName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 7: ");
        int num = input.nextInt();

        String weekday;

        switch (num) {
            case 1:
                weekday = "Sunday";
                break;
            case 2:
                weekday = "Monday";
                break;
            case 3:
                weekday = "Tuesday";
                break;
            case 4:
                weekday = "Wednesday";
                break;
            case 5:
                weekday = "Thursday";
                break;
            case 6:
                weekday = "Friday";
                break;
            case 7:
                weekday = "Saturday";
                break;
            default:
                weekday = "Invalid input";
                break;
        }

        System.out.println("The weekday is " + weekday);
    }
}
//output:
//Enter a number between 1 and 7: 3
//The weekday is Tuesday
