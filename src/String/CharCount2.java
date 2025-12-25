package String;

import java.util.Scanner;

public class CharCount2 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int k = sc.nextInt();
            sc.nextLine();

            int[] count = new int[26];
            int lineNum = 0;

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                if (line == null || line.isEmpty()) continue;
                
                lineNum++;

                for (int i=0 ; i < line.length() ; i++) {
                    char ch = line.charAt(i);
                    
                    if (ch >= 'A' && ch <= 'Z') {
                        int index = ch - 'A';
                        count[index]++;

                        if (count[index] == k) {
                            System.out.println(ch);
                            System.out.println(lineNum);
                            return;
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}