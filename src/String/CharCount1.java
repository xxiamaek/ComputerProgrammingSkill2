package String;

import java.util.Scanner;

public class CharCount1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            int[] count = new int[26];

            for (int i=0 ; i < input.length() ; i++) {
                char ch = input.charAt(i);
                
                if (ch >= 'A' && ch <= 'Z') {
                    count[ch - 'A']++;
                }
            }

            for (int i=0 ; i < count.length ; i++) {
                if (count[i] > 0) {
                    char letter = (char) (i + 'A');
                    System.out.println(letter + " " + count[i]);
                }
            }
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}
