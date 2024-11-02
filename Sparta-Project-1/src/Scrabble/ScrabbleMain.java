package Scrabble;

import java.util.Scanner;

public class ScrabbleMain {
    public static void main(String[] args) {
        ScrabbleScore scorer = new ScrabbleScore();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your word (- to quit)");
        String input = scanner.next();

        while(!input.equals("-") && !input.equals("")){
            System.out.println(scorer.getScrabbleScore(input));
            System.out.println("Enter your word (- to quit)");
            input = scanner.next();
        }
    }
}
