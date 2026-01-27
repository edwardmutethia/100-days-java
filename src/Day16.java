public class Day16 {

    public static void main(String[] args) {
        int a = 15, b = 20;
        System.out.println(findLCM(a,b));

    }

    /*
     * Brute force approach
     *
     * START
     *      INPUT a, b
     *      lcm = maximum(a,b)
     *
     *      WHILE TRUE DO
     *          IF lcm MOD a == 0 AND lcm MOD b == 0 THEN
     *              OUTPUT lcm
     *              STOP
     *          END IF
     *
     *          lcm = lcm + 1
     *      END WHILE
     * END
     */
    public static int findLCM(int a, int b) {
        int lcm = Math.max(a, b);

       while (true) {
           if (lcm % a == 0 && lcm % b == 0) {
               return lcm;
           }
           lcm = lcm+1;
       }
    }
}