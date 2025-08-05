public class Paper extends Move {
  @Override
  public String getName() {
    return "Paper";
  }

  @Override
  public boolean beats(Move other) {
    return other instanceof Rock;
  }
}
