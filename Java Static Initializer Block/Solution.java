import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
          try {
            Scanner sc = new Scanner(System.in);
            int B = sc.nextInt();
            int H = sc.nextInt();
            int Area = B * H;
            if (B == 0 || H == 0) {
                throw new Exception();
            }else if (B <= 0 || H <= 0) {
                throw new Exception();
            }else {
                System.out.println(Area);
            }
        } catch (Exception e) {
            System.out.println(e + ": Breadth and height must be positive");
        }
    }
}
