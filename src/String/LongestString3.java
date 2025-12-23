package String;

import java.util.Scanner;

public class LongestString3 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int maxlength = Integer.MIN_VALUE;
            String maxString = "";

            for(int i=0 ; i < 5 ; i++) {
                String str = sc.nextLine();
                int length = str.length();

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
