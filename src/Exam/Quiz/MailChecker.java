package Exam.Quiz;

import java.util.Scanner;

public class MailChecker {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String email = sc.nextLine();

            int atIndex = email.indexOf('@');
            boolean hasAt = (atIndex != -1);
            String localPart = hasAt ? email.substring(0, atIndex) : "";
            String domain = hasAt ? email.substring(atIndex + 1) : "";

            boolean running = true;
            while (running) {
                int options = sc.nextInt();

                switch (options) {
                    case 0 -> running = false;
                    case 1 -> System.out.println(email.length());
                    case 2 -> System.out.println(hasAt ? "@ is position: " + atIndex : "invalid");
                    case 3 -> {
                        if (hasAt) {
                            System.out.printf("local part length: %d, domain length: %d\n", localPart.length(),
                                    domain.length());
                        } else {
                            System.out.println("invalid");
                        }
                    }
                    case 4 -> {
                        if (!email.equals(email.toUpperCase())) {
                            System.out.println(email.toLowerCase());
                        } else {
                            System.out.println(email);
                        }
                    }
                    case 5 -> {
                        int m = sc.nextInt();
                        int n = sc.nextInt();
                        int k = sc.nextInt();
                        if (hasAt) {
                            boolean isPass = (localPart.length() >= m && domain.length() >= n && email.length() >= k);
                            System.out.println(isPass ? "pass" : "not pass");
                        } else {
                            System.out.println("invalid");
                        }
                    }
                    default -> {
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}