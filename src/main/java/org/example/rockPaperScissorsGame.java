package org.example;

import java.util.Scanner;

public class rockPaperScissorsGame {

    // This is the main method
    public static void main(String[] args) {
        rockPaperScissorsGame game = new rockPaperScissorsGame();
        game.playGame();
    }

    /**
     *  This method plays the game
     */
    public void playGame() {
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Please choose one of the following options:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.println("4. Quit");

        int userChoice = getUserChoice();
        int computerChoice = getComputerChoice();

        if(userChoice == 4) {
            System.out.println("Thank you for playing Rock Paper Scissors!");
        }
        else {
            String getWinner = getWinner(userChoice, computerChoice);
            printWinner(getWinner, userChoice, computerChoice);
        }



    }

    /**
     *  This method gets the user's choice
     * @return userChoice
     */
    public int getUserChoice() {
        int userChoice = 0;
        while (userChoice < 1 || userChoice > 4) {
            System.out.println("Please enter a number between 1 and 4: ");
            Scanner in = new Scanner(System.in);
            userChoice = in.nextInt();
        }
        return userChoice;
    }

    /**
     *  This method gets the computer's choice
     * @return computerChoice
     */
    public int getComputerChoice() {
        int computerChoice = 0;
        while (computerChoice < 1 || computerChoice > 3) {
            computerChoice = (int) (Math.random() * 3 + 1);
        }
        return computerChoice;

    }

    /**
     *  This method prints the winner
     * @param userChoice    user's choice
     * @param computerChoice    computer's choice
     * @return  winner
     */
    public String getWinner(int userChoice, int computerChoice) {
        String winner = "";
        if (userChoice == computerChoice) {
            winner = "It's a tie!";
        } else if (userChoice == 1 && computerChoice == 2) {
            winner = "You win!";
        } else if (userChoice == 2 && computerChoice == 3) {
            winner = "You win!";
        } else if (userChoice == 3 && computerChoice == 1) {
            winner = "You win!";
        } else if (userChoice == 1 && computerChoice == 3) {
            winner = "You lose!";
        } else if (userChoice == 2 && computerChoice == 1) {
            winner = "You lose!";
        } else if (userChoice == 3 && computerChoice == 2) {
            winner = "You lose!";
        }
        return winner;
    }

    /**
     *  This method prints the winner
     * @param winner    winner
     * @param userChoice    user's choice
     * @param computerChoice    computer's choice
     */
    public void printWinner(String winner, int userChoice, int computerChoice) {
        System.out.println(winner);
        System.out.println("Your choice: " + userChoice);
        System.out.println("Computer choice: " + computerChoice);
    }


}