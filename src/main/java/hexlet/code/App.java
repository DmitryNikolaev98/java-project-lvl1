package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.Gcd;
import hexlet.code.game.Prime;
import hexlet.code.game.Progression;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("Your choice:");
        String number = scanner.next();
        switch (number) {
            case "1" -> Cli.greeting();
            case "2" -> Even.game();
            case "3" -> Calc.game();
            case "4" -> Gcd.game();
            case "5" -> Progression.game();
            case "6" -> Prime.game();
            default -> System.exit(0);
        }
        scanner.close();
    }
}
