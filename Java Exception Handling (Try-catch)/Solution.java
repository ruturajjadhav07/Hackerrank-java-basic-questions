import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        try{
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.println(x / y);
        
        
        } catch (ArithmeticException e) {
            System.out.println(e);
        }catch(InputMismatchException e){
            System.out.println("java.util.InputMismatchException");     // The code here was  System.out.println(e); but it shows output with error. So i type String and that Worked. Hurray...!
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
