/**
 * Problem Description: Write a program that counts the number of digits in a given integer.
 *
 * Constraints:
 *
 * Input must be an integer.
 * Works for positive numbers only.
 */

public class Day14 {
    public static void main(String[] arg) {
        int num = 12345;
        int count = 0;

        if (num < 0) {
            System.out.println("Error: Works for positive numbers only");
            return;
        }

        while (num > 0) {
            num = num / 10;
            count++;
        }

        System.out.println("Number of digits = " + count);
    }
}
