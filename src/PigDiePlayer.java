public class PigDiePlayer{
    private int score;
    PigDie dieOne;
    PigDie dieTwo;
    int roll1=-1;
    int roll2=-1;

    public PigDiePlayer(){
        score = 0;
        dieOne = new PigDie();
        dieTwo = new PigDie();
    }

    public int getScore(){
        return score;
    }

    public int setScore(int value){
        score = value;
        return score;
    }
    public void rollDice() {
        roll1 = dieOne.roll();
        roll2 = dieTwo.roll();
        System.out.println("Die 1 "+ roll1 + "\nDie 2 "+ roll2);
    }

    public int getRoll1(){
        return roll1;
    }

    public int getRoll2(){
        return roll2;
    }


    /*public String toString(){
        String result = "Round score:" + (getRoll1() +getRoll2());
        return result;
    }
*/
}