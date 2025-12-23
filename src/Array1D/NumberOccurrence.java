package Array1D;

import java.util.Scanner;

public class NumberOccurrence {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int[] num = new int[n];
            
            for(int i=0 ; i < n ; i++) {
                int x = sc.nextInt();
                num[i] = x; 
            }

            int m = sc.nextInt();
            boolean flag = false;

            for(int i=0 ; i < num.length ; i++) {
                if(num[i]==m) {
                    System.out.print(i+1 + " ");
                    flag = true;
                }
            }

            if (!flag) {
                System.out.println(0);
            }
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}

