package Exam.Quiz;

import java.util.Scanner;

public class Unique {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int[] numbers = new int[n];
            int count = 0;

            for (int i=0 ; i < n ; i++) {
                int input = sc.nextInt();
                boolean isDuplicate = false;

                for (int j = 0; j < count; j++) {
                    if (input == numbers[j]) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (!isDuplicate) {
                    numbers[count] = input;
                    count++;
                }
            }

            for (int i = 0; i < count; i++) {
                System.out.print(numbers[i] + " ");
            }

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}