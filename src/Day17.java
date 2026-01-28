/**
 * Problem Description:
 * Write a program to calculate `base^exponent` * using a loop.
 * 
 * Constraints:
 *  Base and exponent must be integers.
 *  Exponent must be non-negative. 
 */

public class Day17 {
    public static void main(String[] args) {
        int base = 2, exponent = -5;

        if (exponent < 0) {
            System.out.println("Exponent must be non-negative.");
            return;
        }
        
        System.out.println(power(base, exponent));
    }

    public static int power(int base, int n) {
        int p, i = 1;

        p = 1;

        while (i <= n) {
            p = p * base;
            i++;
        }
        
        return p;
    }
}
