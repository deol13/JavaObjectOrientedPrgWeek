package se.lexicon.InterfaceLecturePractice;

import java.util.Scanner;

public interface CalculatorInterface {
    Scanner scanner = new Scanner(System.in);

    double add(double x, double y);
    double subtract(double x, double y);
    double divide(double x, double y);
    double multiply(double x, double y);

    static String input(String text){
        System.out.println(text);
        return scanner.nextLine();
    }

    default void calculate(){
        String currentOperation = "+";
        double sum = 0.0;
        boolean calculatorOperational = true;
        while (calculatorOperational) {
            String input = input("Current operation: " + currentOperation + "\nInput:");

            switch (input) {
                case "+":
                    currentOperation = "+";
                    break;
                case "-":
                    currentOperation = "-";
                    break;
                case "*":
                    currentOperation = "*";
                    break;
                case "/":
                    currentOperation = "/";
                    break;
                case "Exit":
                    calculatorOperational = false;
                    break;
                default:
                    try {
                        double number = Double.parseDouble(input);
                        switch (currentOperation) {
                            case "+":
                                sum = add(sum, number);
                                break;
                            case "-":
                                sum = subtract(sum, number);
                                break;
                            case "*":
                                sum = multiply(sum, number);
                                break;
                            case "/":
                                sum = divide(sum, number);
                                break;
                        }
                    }
                    catch (Exception e) { System.out.println("Invalid number."); }
                    break;
            }
            System.out.println("Sum: " + sum);
        }
    }
}
