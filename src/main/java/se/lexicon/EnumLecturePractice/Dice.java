package se.lexicon.EnumLecturePractice;

import java.util.Random;

public enum Dice {
    D6(6),
    D10(10),
    D20(20),
    D100(100);

    private int maxValue;

    private Dice(int dice) {
        maxValue = dice;
    }

    public int roll(){
        Random rand = new Random();
        return rand.nextInt(maxValue + 1);
    }
}
