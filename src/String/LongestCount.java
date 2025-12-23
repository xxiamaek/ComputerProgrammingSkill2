package String;

import java.util.Scanner;

public class LongestCount {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int maxlength = Integer.MIN_VALUE;
            int cnt = 0;

            for( ; ; ) {
                String str = sc.nextLine();
                int length = str.length();

                if(length == 0) break;

                if(length > maxlength) {
                    maxlength = length;
                    cnt = 1;
                } else if (length == maxlength) {
                    cnt++;
                }
            }
            System.out.println(maxlength);
            System.out.println(cnt);
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}
