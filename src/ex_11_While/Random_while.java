package ex_11_While;

import java.util.Random;
import java.util.Scanner;

public class Random_while {
    public static void main(String[] args) {
        Random random = new Random();
        int guessnumb = random.nextInt(100) + 1; //0 to 100
        //System.out.println(guessnumb);

        Scanner s = new Scanner(System.in);
        System.out.println("Enter your guess number from 0 to 100");
        int guess;
        int attempts = 0;
        while (true) {
            guess = s.nextInt();
            attempts++;
            if (guess < guessnumb) {
                System.out.println("Low");
            } else if (guess > guessnumb) {
                System.out.println("High");
            } else {
                System.out.println("Correct! You guessed it in " + attempts + "attempts");
                break;
            }
        }
    }
    }

