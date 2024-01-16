import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        List<Integer> num = new ArrayList<Integer>();
        try (Scanner sc = new Scanner(System.in)) {
            int nums = sc.nextInt();
            for (int i = 0; i < nums; i++) {
                int nums2 = sc.nextInt();
                    num.add(nums2);
                    System.out.println(num.get(i));
            }
        }
        
        

    }
}
