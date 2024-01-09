import java.io.*;
import java.util.*;

class Sports {
    String getName() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers(int n) {
        System.out.println("Each team has n players in " + getName());
    }
}

class Soccer extends Sports {
    @Override
    String getName() {
        return "Soccer Class";
    }

    void getNumberOfTeamMembers() {    
        System.out.println("Each team has 11 players in " + getName());
    }
}

public class Solution {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */

        Sports obj = new Sports();
        System.out.println(obj.getName());
        obj.getNumberOfTeamMembers(0);

        Soccer obj1 = new Soccer();
        System.out.println(obj1.getName());
        obj1.getNumberOfTeamMembers();



    }
}
