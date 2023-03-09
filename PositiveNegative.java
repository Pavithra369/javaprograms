// Program to check wheter a given number is poitive or negative
import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double num = input.nextDouble();
        if(num > 0) {
            System.out.println("The number is positive.");
        }
        else if(num < 0) {
            System.out.println("The number is negative.");
        }
        else {
            System.out.println("The number is zero.");
        }
        input.close();
    }
}
// Output:
//Enter a number: -9
//The number is negative.
