package String;

import java.util.Scanner;

public class LongestString4 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int maxlength = Integer.MIN_VALUE;
            String maxString = "";

            for( ; ; ) {
                String str = sc.nextLine();
                int length = str.length();

                if(length == 0) break;

                boolean isLongest = (length >= maxlength);

                if(isLongest) {
                    maxlength = length;
                    maxString = str;
                }
            }
            System.out.println(maxString);
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}
