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
            System.out.println("Think of a number from 1-100 and I will try to figure it out. Tell me if it is higher, lower, or correct. ");
            int compNum = (int) (101 * Math.random());
            System.out.println("Is your number " +compNum);
            Scanner check = new Scanner(System.in);
            String result = check.nextLine();
            int lowValue = 0;
            int highValue = 100;
            int change = 0;
            while(!(result.equals("Correct") || (result.equals("correct"))))
            {
                if (result.equals("Higher") || (result.equals("higher")))
                {
                    lowValue = compNum;
                    change = (highValue - lowValue) / 2;
                    compNum = lowValue + change;
                    System.out.println("Is your number " + compNum);
                    check = new Scanner(System.in);
                    result = check.nextLine();
                }
                if (result.equals("Lower") || (result.equals("lower")))
                {
                    highValue = compNum;
                    change = (highValue - lowValue) / 2;
                    compNum = highValue - change;
                    System.out.println("Is your number " + compNum);
                    check = new Scanner(System.in);
                    result = check.nextLine();
                }
            }
                System.out.println("I figured out the number " +name);
        }
        else
        {
            System.out.println("You didn't choose a valid game mode " +name);
        }
    }
}
