import java.util.Scanner;

public class PigDieGame {
    PigDiePlayer player1;
    PigDiePlayer player2;
    Scanner scan;
    int totalScore;
    int newScore;
    int totalScore1 = 0;
    int totalScore2 = 0;

    public PigDieGame() {
        player1 = new PigDiePlayer();
        player2 = new PigDiePlayer();
        scan = new Scanner(System.in);
    }

    public void start() {
        while (player1.getScore() < 100 && player2.getScore() < 100) {
            System.out.println("Player 1's turn:");
            playerTurn(player1);
            System.out.println("Player 2's turn:");
            playerTurn(player2);

        }

        if (player1.getScore() >= 100) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins");
        }

    }


    private void playerTurn(PigDiePlayer player) {
        String answer = "r";
        int newScore = 0;
        while (answer.equals("r")) {
            System.out.println("Would you like to roll or pass? (r/p)");
            answer = scan.nextLine();
            if (answer.equals("r")) {

                player.rollDice();

                if (player.getRoll1() == 1 && player.getRoll2() == 1) {
                    System.out.println("Yikes! Snake Eyes. Total score reset.");
                    newScore = 0;
                    answer = "p";
                    System.out.println("Round Score: " + player.getScore());

                } else if (player.getRoll1() == 1 || player.getRoll2() == 1) {
                    System.out.println("Uh oh you rolled a one. Round score reset.");
                    newScore = player.getScore();
                    answer = "p";
                    System.out.println("Round Score: 0");

                } else {
                    newScore = player.getScore() + player.getRoll1() + player.getRoll2();
                    System.out.println("Round score:" + newScore);
                    player.setScore(newScore);

                }

                if (newScore > player.getScore()) {
                    System.out.println("Rolls added to score");
                }
            }
            player.setScore(newScore);
            System.out.println("total score:" + player.getScore());
        }
    }
}