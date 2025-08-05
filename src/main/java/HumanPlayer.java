import java.util.Scanner;

public class HumanPlayer extends Player {
  private final Scanner scanner;

  public HumanPlayer(String name, Scanner scanner) {
    super(name);
    this.scanner = scanner;
  }

  @Override
  public Move makeMove() {
    System.out.println(name + ", enter your move (rock, paper, scissors): ");
    while (true) {
      String input = scanner.nextLine().trim().toLowerCase();
      switch (input) {
        case "rock":
          return new Rock();
        case "paper":
          return new Paper();
        case "scissors":
          return new Scissors();
        default:
          System.out.println("Invalid move! Please enter rock, paper, or scissors.");
      }
    }
  }
}