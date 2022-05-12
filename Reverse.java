/* Vincent X 
 * May 12, 2022
 * This program reads in a text file and spits out the lines in reversed order
 */

import java.util.*;
import java.io.*;

public class Reverse {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("t.txt"));

        reverse(input); 
        // reverseStack(input);      
    }

    public static void reverse(Scanner input) {
        if (input.hasNextLine()) {
            String line = input.nextLine();
            reverse(input);
            System.out.println(line);
        }
    }

    public static void reverseStack(Scanner input) {
        Stack<String> s = new Stack<>();
        while (input.hasNextLine()) {
            s.push(input.nextLine());
        }
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}