import java.util.Scanner;

public class Solution {

public static String getSmallestAndLargest(String s, int k) {
    String smallest = "";
    String largest = "";

    java.util.ArrayList<String> substrings = new java.util.ArrayList<>();      
    for(int start=0;start<=s.length()-k;start++)
    {
        int end =start+k;
        String substring =s.substring(start,end);
        substrings.add(substring);            
    }
   smallest = java.util.Collections.min(substrings);
   largest =java.util.Collections.max(substrings);
   return smallest + "\n" + largest;
}


public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int k = scan.nextInt();
    scan.close();

    System.out.println(getSmallestAndLargest(s, k));
}
}
