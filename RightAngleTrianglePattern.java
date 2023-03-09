//write a java Program in Java to display the pattern like right angle triangle with a number.

import java.util.Scanner;

public class RightAngleTrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
//output:
//Enter the number of rows: 5
//1
//12
//123
//1234
//12345
