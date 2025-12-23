package String;

import java.util.Scanner;

public class LongestString1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int maxlength = Integer.MIN_VALUE;

            for(int i=0 ; i < 5 ; i++) {
                String str = sc.nextLine();
                int length = str.length();

                boolean isLongest = (length > maxlength);

                if(isLongest) {
                    maxlength = length;
                }
            }
            System.out.println(maxlength);
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}
