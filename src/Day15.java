/**
 * Problem Description:
 * Write a program to find the Greatest Common Divisor (GCD) of two integers.
 *
 * Constraints:
 *      Both inputs must be integers.
 *      GCD of two numbers is the largest integer that divides both numbers.
 */

public class Day15 {
    public static void main(String[] args) {
        int a = 56, b = 98;

        System.out.println(findGCD(a, b));
    }

    /*
     * brute force approach to find GCD
     *      Check all numbers from 1 up to the smallest number
     *      and find the largest number that divides both
     *
     * START
     *      INPUT a, b
     *      gcd <- 1
     *
     *      FOR i from 1 to minimum(a,b) DO
     *          IF a MOD i = 0 AND b MOD i = 0 THEN
     *             gcd = i
     *          END IF
     *      END FOR
     *
     *      OUTPUT gcd
     * END
     */
    static int findGCD(int a, int b) {
        int min = Math.min(a, b);

        for (int i = min; i > 1; i--) {
            if (a % i == 0 && b % i == 0)
                return i;
        }

        return 1;
    }

    /*
     * Using Euclidean Algorithm - The GCD of two numbers does not change
     * if the larger number is replaced by the remainder when it is divided
     * by the smaller number.
     *
     * START
     *      INPUT a, b
     *
     *      WHILE b is not equal to 0 DO
     *          remainder <- a MOD b
     *          a <- b
     *          b <- remainder
     *      END WHILE
     *
     *      OUTPUT a as GCD
     *  END
     */
}
