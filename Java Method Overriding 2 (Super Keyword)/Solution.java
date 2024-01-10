// The Solution for this code is solved without using Super keyword.

import java.util.*;
import java.io.*;

class BiCycle {
    String define_me() {
        return "a vehicle with pedals.";
    }
}

class MotorCycle extends BiCycle {
    String define_me() {
        return "a cycle with an engine.";
    }

    public void MotorCycle() {
        System.out.println("Hello I am a motorcycle, I am " + define_me());
    }
}

class Solution {
    public static void main(String[] args) {
        /*
         * * Enter your code here. Read input from STDIN. Print output to STDOUT. Your *
         * class should be named Solution.
         */ MotorCycle M = new MotorCycle();
        M.MotorCycle();
        BiCycle obj = new BiCycle();
        System.out.println("My ancestor is a cycle who is " + obj.define_me());
    }
}
