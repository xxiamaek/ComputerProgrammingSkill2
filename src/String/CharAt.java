package String;

import java.util.Scanner;

public class CharAt {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            String str = sc.nextLine();
            int index = sc.nextInt();

            index = index - 1;
            int length = str.length();
            boolean isValid = (index >= 0 && index < length);

            if(isValid) {
                System.out.println(str.charAt(index));
            } else {
                System.out.println("invalid position");
            }
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}

