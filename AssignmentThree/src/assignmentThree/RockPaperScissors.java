package assignmentThree;

/**
 * @date 2021-1-17
 * @author Justin Kreifels
 * This program takes in input and compares it to a random number between 0 and 2. It then prints the results.
 */

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {

    public static void main(String[] args) {
        System.out.printf("\n%s\n", director());
    }

    static int randNum() {
        Random rand = new Random();
        int num = rand.nextInt(3);
        
        String randChoice = null;
        
        switch (num) {
            case 0:
                randChoice = "Rock";
                break;
            case 1:
                randChoice = "Paper";
                break;
            case 2:
                randChoice = "Scissors";
        }
        
        System.out.printf("\nI choose %s\n", randChoice);
        return num;
    }

    static int choice() {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors.");
        System.out.print("1. Rock\n2. Paper\n3. Scissors\nPlease input a number only >> ");
        int num = input.nextInt();
        input.close();
        
        return num;
    }
    
    static String director() {
        int x = choice() - 1;
        int y = randNum();
        String gameMatch = null;
        
        if (x == 2 && y == 0) gameMatch = "You Lose";
        else if (x > y || (x == 0 && y == 2)) gameMatch = "You Win";
        else if (x == y) gameMatch = "Draw";
        else gameMatch = "You Lose";
        
        return gameMatch;
    }
    

}
