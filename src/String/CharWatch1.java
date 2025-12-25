package String;

import java.util.Scanner;

class CharWatch1 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            char target1 = sc.next().charAt(0);
            char target2 = sc.next().charAt(0);
            char target3 = sc.next().charAt(0);
            sc.nextLine();

            String mainString = sc.nextLine();

            int N = sc.nextInt();

            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int errorCount = 0;

            for (int i=0 ; i < N ; i++) {
                int pos = sc.nextInt();

                if (pos < 1 || pos > mainString.length()) {
                    errorCount++;
                } else {
                    char charAtPos = mainString.charAt(pos - 1);

                    if (charAtPos == target1) {
                        count1++;
                    } else if (charAtPos == target2) {
                        count2++;
                    } else if (charAtPos == target3) {
                        count3++;
                    }
                }
            }

            System.out.println(count1);
            System.out.println(count2);
            System.out.println(count3);
            System.out.println(errorCount);
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}