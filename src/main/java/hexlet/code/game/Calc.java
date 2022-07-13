package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;
import hexlet.code.exceptions.OperationException;

import java.util.Random;

public class Calc {
    public static final int MAX_RANDOM_NUMBER = 15;
    public static String[][] askAndQuestion = new String[Engine.NUMBER_ROUNDS][2];
    public static String[] operators = {"-", "+", "*", "/"};

    public static void game() {
        String description = "Welcome to the Brain Games!";
        for (int i = 0; i < Engine.NUMBER_ROUNDS; i++) {
            int expression1 = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);
            int expression2 = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);
            String operators = String.valueOf(Calc.generateOperator());
            askAndQuestion[i][Engine.QUESTION_NUMBER] = expression1 + " " + operators + " " + expression2;
            askAndQuestion[i][Engine.ANSWER_NUMBER] = calculate(operators, expression1, expression2);

//            try {
//                askAndQuestion[i][Engine.QUESTION_NUMBER] = expression1 + " " + operators + " " + expression2;
//                askAndQuestion[i][Engine.ANSWER_NUMBER] = calculate(operators, expression1, expression2);
//            } catch (OperationException e) {
//                e.printStackTrace();
//            }

        }
        Engine.startGame(description, askAndQuestion);
    }
    public static String calculate(String operators, int expression1, int expression2) {

        switch (operators) {
            case "+" -> {
                 return String.valueOf(expression1 + expression2);
            }
            case "-" -> {
                 return String.valueOf(expression1 - expression2);
            }
            case "*" -> {
                 return String.valueOf(expression1 * expression2);
            }

            default -> {
               return "Unsupported operation!";
            }

//            default -> {
//                    throw new OperationException("Unsupported operation");
//            }
        }
    }
    public static String generateOperator() {
        final int randomOperator = 4;
        Random random = new Random();
        int i = random.nextInt(randomOperator);
        return operators[i];
    }
}
