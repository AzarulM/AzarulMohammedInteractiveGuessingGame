package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner name1 = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = name1.nextLine();
        System.out.println("Welcome " + name);
        Scanner choose = new Scanner(System.in);
        System.out.println("Choose if you want to play game(1) or game(2)");
        int game = choose.nextInt();
        if (game == 1)
        {
            int randomNum = (int) (17 * Math.random());
            Scanner input = new Scanner(System.in);
            System.out.println("Guess a number between 1-16");
            int guess = input.nextInt();
            while (guess != randomNum) {
                System.out.println("Incorrect! Try Again");
                guess = input.nextInt();
            }
            System.out.println("Correct! You guessed the number " +name);
        }
        else if (game == 2)
        {
            
        }
        else
        {
            System.out.println("You didn't choose a valid game mode " +name);
        }
    }
}
