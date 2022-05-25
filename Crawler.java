/* Author: Vincent X
 * Date: May 25, 2022
 */

import java.util.*;
import java.io.*;

public class Crawler {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("directory or file name? ");
        String name = console.nextLine();
        File f = new File(name);
        if (!f.exists()) {
            System.out.println("Does not exist");
        } else {
            print(f);
        }    
    }

    public static void print(File f) {
        print(f, 0);
    }

    private static void print(File f, int indent) {
        for (int i = 0; i < indent; i++) {
            System.out.print("    ");
        }
        System.out.println(f.getName());
        if (f.isDirectory()) {
            for (File subF : f.listFiles()) {
                print(subF, indent + 1);
            }
        }
    }
}