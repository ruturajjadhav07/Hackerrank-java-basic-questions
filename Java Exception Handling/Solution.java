import java.io.*;
import java.util.*;

class MyCalculator {

    public void method1(int n, int p) {
        System.out.println((int) (Math.pow(n, p)));
    }

}

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            try {

                // System.out.print("Enter number");
                int n = sc.nextInt();
                // System.out.print("Enter number");
                int p = sc.nextInt();
                MyCalculator obj = new MyCalculator();

                if (n == 0 && p == 0) {
                    throw new Exception("n and p should not be zero.");
                } else if (n < 0 || p < 0) {
                    throw new Exception("n or p should not be negative.");
                }
                obj.method1(n, p);

            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }
}
