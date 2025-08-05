import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
  private Game game = new Game();

  @Test
  public void testRockBeatsScissors() {
    Move rock = new Rock();
    Move scissors = new Scissors();
    assertTrue(rock.beats(scissors), "Rock should beat Scissors");
  }

  @Test
  public void testPaperBeatsRock() {
    Move paper = new Paper();
    Move rock = new Rock();
    assertTrue(paper.beats(rock), "Paper should beat Rock");
  }

  @Test
  public void testScissorsBeatsPaper() {
    Move scissors = new Scissors();
    Move paper = new Paper();
    assertTrue(scissors.beats(paper), "Scissors should beat Paper");
  }

  @Test
  public void testSameMoveResultsInTie() {
    Move rock1 = new Rock();
    Move rock2 = new Rock();
    assertEquals("It's a tie!", game.determineWinner(rock1, rock2), "Same moves should result in a tie");
  }

  @Test
  public void testPlayer1Wins() {
    Move rock = new Rock();
    Move scissors = new Scissors();
    game = new Game() {
      @Override
      public String determineWinner(Move move1, Move move2) {
        return super.determineWinner(move1, move2);
      }
    };
    assertEquals("Player 1 wins!", game.determineWinner(rock, scissors), "Player 1 should win when Rock beats Scissors");
  }

  @Test
  public void testPlayer2Wins() {
    Move paper = new Paper();
    Move rock = new Rock();
    game = new Game() {
      @Override
      public String determineWinner(Move move1, Move move2) {
        return super.determineWinner(move1, move2);
      }
    };
    assertEquals("Computer wins!", game.determineWinner(rock, paper), "Player 2 should win when Paper beats Rock");
  }
}