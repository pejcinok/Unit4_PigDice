public class PigDiceClient{
    public static void main (String [] args){
        PigDieGame newGame = new PigDieGame();

        System.out.println("Welcome to Pig Dice!");

        newGame.start();

        System.out.println("\nThanks for playing!\n");
    }
}