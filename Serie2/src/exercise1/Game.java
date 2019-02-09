package exercise1;

public class Game {
    public static void main(String[] args){
        int nbGames = Integer.parseInt(args[0]);
        Dice dice1 = new Dice();
        Dice dice2 = new Dice();
        for (int i = 1; i <= nbGames; i++){
            System.out.println("Game number = " + i);
            dice1.launchDice();
            dice2.launchDice();
            System.out.println("First dice's value = "+dice1.getValue());
            System.out.println("Second dice's value = "+dice2.getValue());
            if(dice1.getValue() == dice2.getValue()){
                System.out.println("Songratulations, You Won the game !!!!");
            }
            System.out.println();
        }
        System.out.println("Finished");
    }
}
