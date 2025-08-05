package com.example;

public abstract class Move {
  public abstract String getName();
  public abstract boolean beats(Move other);
}
