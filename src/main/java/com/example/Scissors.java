package com.example;

public class Scissors extends Move {
  @Override
  public String getName() {
    return "Scissors";
  }

  @Override
  public boolean beats(Move other) {
    return other instanceof Paper;
  }
}
