import java.io.*;
import java.util.*;


abstract class Book {
    String title;

    public String getTitle() {
        return title;
    }

    abstract void setTitle(String s);

    
}

class NewBook extends Book {

    public void setTitle(String s) {
        this.title = s;
    }
}

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();

        NewBook obj = new NewBook();
        obj.setTitle(title);

        System.out.println("The title is: " + obj.getTitle());

    }

}
