package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Utils;

public class Progression {

    public static final int MAX_RANDOM_NUMBER = 89;
    public static final int MIN_STEP = 2;
    public static final int MAX_STEP = 10;
    public static final int LENGTH_PROGRESSION = 10;

    public static void progressionGame() {

        String description = "What number is missing in the progression?";

        String[][] askAndQuestion = new String[Engine.NUMBER_OF_ROUNDS][Engine.AMOUNT_QUESTION];

        for (int i = 0; i < Engine.NUMBER_OF_ROUNDS; i++) {

            int startProgressionGame = Utils.generateRandomNumber(MAX_RANDOM_NUMBER);
            int stepProgressionGame = Utils.differanceMaxAndMin(MAX_STEP, MIN_STEP);
            String[] rowNumberProgression = new String[LENGTH_PROGRESSION];
            String[] rowProgression = {"", "", ""};
            int hiddenNumber = Utils.anyNumber(LENGTH_PROGRESSION - 1);
            String[] numbers = new String[LENGTH_PROGRESSION];

            for (int j = 0; j < LENGTH_PROGRESSION; j++) {
                
                numbers[j] = String.valueOf( startProgressionGame + (j * stepProgressionGame));
                rowNumberProgression[j] = (j == hiddenNumber) ? ".. " : ((numbers[j]) + " ");
                rowProgression[i] += rowNumberProgression[j];
                askAndQuestion[i][Engine.ANSWER_NUMBER] = String.valueOf(numbers[hiddenNumber]);
                askAndQuestion[i][Engine.QUESTION_NUMBER] = rowProgression[i];
                
            }

        }
        Engine.startGame(description, askAndQuestion);
    }
}