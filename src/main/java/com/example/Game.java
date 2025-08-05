package com.example;

import java.util.Scanner;

public class Game {
  private Player player1;
  private Player player2;
  private Scanner scanner;

  public Game() {
    this.scanner = new Scanner(System.in);
    this.player1 = new HumanPlayer("Player 1", scanner);
    this.player2 = new ComputerPlayer("Computer");
  }

  public String determineWinner(Move move1, Move move2) {
    if (move1.getClass().equals(move2.getClass())) {
      return "It's a tie!";
    } else if (move1.beats(move2)) {
      return player1.getName() + " wins!";
    } else {
      return player2.getName() + " wins!";
    }
  }

  public void playRound() {
    Move move1 = player1.makeMove();
    Move move2 = player2.makeMove();
    System.out.println(player1.getName() + " chose " + move1.getName());
    System.out.println(player2.getName() + " chose " + move2.getName());
    System.out.println(determineWinner(move1, move2));
  }

  public void start() {
    System.out.println("Welcome to Rock-Paper-Scissors!");
    while (true) {
      playRound();
      System.out.println("Play again? (yes/no): ");
      String playAgain = scanner.nextLine().trim().toLowerCase();
      if (!playAgain.equals("yes") && !playAgain.equals("y")) {
        break;
      }
    }
    scanner.close();
    System.out.println("Thanks for playing!");
  }

  public static void main(String[] args) {
    Game game = new Game();
    game.start();
  }
}