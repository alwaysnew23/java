/* Author: Vincent X
 * Date: May 19, 2022
 * This program gives the binary representation of an integer.
 */

public class WriteBinary {
    public static void main(String[] args) {       
        writeBinary(-7);
        System.out.println();
    }

    public static void writeBinary(int n) {
        if (n < 0) {
            System.out.print("-");
            writeBinary(-n);
        } else if (n < 2) {
            System.out.print(n);
        } else {
            writeBinary(n / 2);
            writeBinary(n % 2);
        }
    }
}