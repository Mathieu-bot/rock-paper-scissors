import java.util.Random;

public class ComputerPlayer extends Player {
  private final Random random;
  private static final Move[] MOVES = {new Rock(), new Paper(), new Scissors()};

  public ComputerPlayer(String name) {
    super(name);
    this.random = new Random();
  }

  @Override
  public Move makeMove() {
    return MOVES[random.nextInt(MOVES.length)];
  }
}