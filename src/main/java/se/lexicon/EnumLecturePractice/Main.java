package se.lexicon.EnumLecturePractice;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Dice dice = Dice.D6;
        boolean stop = false;

        while (!stop){
            System.out.println("Available dices: d6, d10, d20, d100");
            System.out.println("roll a dice: ");
            String diceCast = scanner.nextLine();
            switch (diceCast) {
                case "d6":
                    dice = Dice.D6;
                    break;
                case "d10":
                    dice = Dice.D10;
                    break;
                case "d20":
                    dice = Dice.D20;
                    break;
                case "d100":
                    dice = Dice.D100;
                    break;
                case "Exit":
                    stop = true;
                    break;
                default:
                    System.out.println("Not an available dice.");
                    continue;
            }
            System.out.println("Dice landed on: " + dice.roll());
        }
    }
}


