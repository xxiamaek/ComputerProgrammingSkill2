package Array1D;

import java.util.Scanner;

public class TeamCompetition {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();

            int[] Team1 = new int[n], Team2 = new int[n];
            
            for(int i=0 ; i < n ; i++) {
                int AddScore = sc.nextInt();
                Team1[i] = AddScore;
            }

            for(int i=0 ; i < n ; i++) {
                int AddScore = sc.nextInt();
                Team2[i] = AddScore;
            }

            int Team1Score = 0, Team2Score = 0; 
            for(int i=0 ; i < n ; i++) {
                if(Team1[i]>Team2[i]) {
                    Team1Score+=2;
                } else if (Team2[i]>Team1[i]) {
                    Team2Score+=2;
                } else {
                    Team1Score++;
                    Team2Score++;
                }
            }

            if(Team1Score > Team2Score) {
                System.out.println("Team 1 wins");
                System.out.print("Score " + Team1Score + " to " + Team2Score);
            }  else if(Team2Score > Team1Score) {
                System.out.println("Team 2 wins");
                System.out.print("Score " + Team2Score + " to " + Team1Score);
            } else {
                System.out.println("Draw game");
                System.out.print("Score " + Team1Score + " to " + Team2Score);
            }
            
        } catch (Exception e) {
            System.out.println("Input Error: " + e.getMessage());
        }
    }
}
