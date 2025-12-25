package Array1D;

import java.util.Scanner;

public class SlotRsv {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int p = sc.nextInt();

            int[] A1 = new int[n+1];
            int[] A2 = new int[n+1];

            for(int i=0 ; i<p ; i++) {
                int rsv = sc.nextInt();
                if(A1[rsv]<k) {
                    A1[rsv]++;
                    System.out.println(1);
                } else {
                    A2[rsv]++;
                    System.out.println(2);
                }
            }

            for(int i=1 ; i<=n ; i++) {
                System.out.print(A1[i]+" ");
            }
            System.out.println();
            for(int i=1 ; i<=n ; i++) {
                System.out.print(A2[i]+" ");
            }
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}
