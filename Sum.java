/* Author: Vincent X
 * Date: May 23, 2022
 * This program computes the sum of an integer array recursively. 
 */

public class Sum {
    public static void main(String[] args) {       
        int[] a = {3, 2, 11};
        System.out.println(sum(a));
    }

    public static int sum(int[] list) {
        return sum(list, 0);
    }

    private static int sum(int[] list, int index) {
        if (index == list.length) {
            return 0;
        } else {
            return list[index] + sum(list, index + 1);
        }
    }
}