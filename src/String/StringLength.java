package String;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
       try(Scanner sc = new Scanner(System.in)) {
           String str = sc.nextLine();
           System.out.println(str.length());
       } catch (Exception e) {
           System.out.println("Input Error: " + e.getMessage());
       }
    }  
}