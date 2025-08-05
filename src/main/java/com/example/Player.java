package com.example;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Player {
  protected String name;

  public abstract Move makeMove();
}