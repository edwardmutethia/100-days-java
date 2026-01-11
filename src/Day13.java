/**
 * Write a program that finds the sum of the 
 * digits of a given integer.
 * **Constraints:**
 *  * Input must be an integer.
 *  * Works for positive numbers only.
 */

public class Day13 {

    public static void main(String[] args) {
        int num = -1;
        int sum = 0;
    
        if (num < 0) {
            System.out.println("Num cannot be Negative");
            return;
        }
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}


