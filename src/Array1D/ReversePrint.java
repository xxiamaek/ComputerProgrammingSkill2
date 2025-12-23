package Array1D;

import java.util.Scanner;

public class ReversePrint {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] num = new int[n];
            
            for(int i=0 ; i < num.length ; i++) {
                int x = sc.nextInt();
                num[i] = x; 
            }
            for(int i = (num.length-1) ; i >= 0; i--) {
                System.out.print(num[i] + " ");
            }
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        } 
    }
}
