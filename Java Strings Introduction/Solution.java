import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();

        String s3 = s1 + s2;
        System.out.println(s3.length());

        if (s1.compareTo(s2) > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.println(
                s1.toUpperCase().charAt(0) + s1.substring(1) 
                + " " + s2.toUpperCase().charAt(0) + s2.substring(1));

    }
}
