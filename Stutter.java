/* Author: Vincent X
 * Date: May 18, 2022
 * This program takes an integer like 421 and spits out 442211
 */

public class Stutter {
    public static void main(String[] args) {       
        System.out.println(stutter(-128));
    }

    public static int stutter(int n) {
        if (n < 0) {
            return -stutter(-n);
        } else if (n < 10) {
            return n * 11;
        } else {
            return stutter(n % 10) + 100 * stutter(n / 10);
        }      
    }
}