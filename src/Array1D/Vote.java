package Array1D;

import java.util.Scanner;

public class Vote {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int winnerNumber = -1, maxVotes = -1;

            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] votes = new int[n + 1];

            for (int i = 0 ; i < k ; i++) {
                int candidate = sc.nextInt();

                if (candidate >= 1 && candidate <= n) {
                    votes[candidate]++;
                }
            }

            for (int i=1 ; i <= votes.length ; i++) {
                if (votes[i] > maxVotes) {
                    maxVotes = votes[i];
                    winnerNumber = i;
                }
            }

            System.out.println(winnerNumber);
            System.out.println(maxVotes);
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}
