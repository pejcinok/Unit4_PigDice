import java.util.Scanner;

public class PigDieGame {
    PigDiePlayer player1;
    PigDiePlayer player2;
    Scanner scan;


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
            score(player2);

        }


        if (player1.getScore() >= 100) {
            System.out.println("Player 1 wins!");
        } else {
            System.out.println("Player 2 wins");
        }

    }

        private void playerTurn (PigDiePlayer player){
            String answer = "r";

            while (answer.equals("r")) {
                System.out.println("Would you like to roll or pass? (r/p)");
                answer = scan.nextLine();
                if (answer.equals("r")) {

                    player.rollDice();
                    score(player);

                }
            }

        }
        private void score(PigDiePlayer player){
            int newScore = 0;
            if (player.getRoll1() == 1 && player.getRoll2() == 1) {
                System.out.println("Yikes! Snake Eyes. Total score reset.");
                System.out.println("Round Score: " + player.getScore());

            }
            if (player.getRoll1() == 1 || player.getRoll2() == 1) {
                System.out.println("Uh oh you rolled a one. Round score reset.");
                newScore = 0;
                System.out.println("Round Score: 0");

            }
            else{
                newScore = player.getRoll1() + player.getRoll2();
                System.out.println("Round score: " + newScore);


            }

            player.setScore((player.getScore() + newScore));
            System.out.println("Total score:" + player.getScore());
        }


}