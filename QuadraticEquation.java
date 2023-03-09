//write a java program Program to solve quadratic equations (use if, else if and else).

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter coefficient a: ");
        double a = input.nextDouble();

        System.out.print("Enter coefficient b: ");
        double b = input.nextDouble();

        System.out.print("Enter coefficient c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.println("The roots are " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);

            System.out.println("The root is " + root);
        } else {
            System.out.println("The equation has no real roots");
        }
    }
}
//output:
//Enter coefficient a: 2
//Enter coefficient b: -4
//Enter coefficient c: -2
//The roots are 2.414213562373095 and -0.41421356237309515
