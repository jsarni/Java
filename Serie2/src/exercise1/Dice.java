package exercise1;

import java.util.Random;

public class Dice {
    private int value;

    public Dice() {
        this.value = 1;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void launchDice(){
        Random r = new Random();
        int newValue = r.nextInt(6) + 1;
        this.setValue(newValue);
    }
}
