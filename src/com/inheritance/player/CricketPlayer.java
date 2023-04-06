package com.inheritance.player;
public class CricketPlayer extends Player {
  private String type;

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public void score() {
    System.out.println("Run scored !!");
  }
}
