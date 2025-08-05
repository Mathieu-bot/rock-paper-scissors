package com.example;

public class Rock extends Move {
  @Override
  public String getName() {
    return "Rock";
  }

  @Override
  public boolean beats(Move other) {
    return other instanceof Scissors;
  }
}