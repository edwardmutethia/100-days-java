/**
 * Problem Description:
 * Write a program to find the Greatest Common Divisor (GCD) of two integers.
 *
 * Constraints:
 *      Both inputs must be integers.
 *      GCD of two numbers is the largest integer that divides both numbers.
 */

public class Day15 {
    
    static int gcp(int a, int b) {
    // Store minimum(a,b)
       int i;

       if (a < b)
           i = a;
       else
           i = b;

        for (i = i; i > 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }

        return 1;
    }


    public static void main(String[] args) {
        int a = 56, b = 98;

        System.out.println(gcp(a, b));
    }
}
