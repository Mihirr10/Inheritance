package com.inheritance;
import com.inheritance.player.*;

public class Main {
  public static void main(String[] args) {
    CricketPlayer cricketPlayer = new CricketPlayer();
    BadmintonPlayer badmintonPlayer = new BadmintonPlayer();
    System.out.println("Player Details:\n");
    cricketPlayer.setPlayerNumber(23);
    cricketPlayer.setPlayerName("sachin");
    cricketPlayer.setType("cricket com.inheritance.main.player");

    badmintonPlayer.setPlayerNumber(10);
    badmintonPlayer.setPlayerName("Lee Chong wei");
    badmintonPlayer.setType("Badminton Player");

    System.out.println("Player Number:" + cricketPlayer.getPlayerNumber());
    System.out.println("Player Name:" + cricketPlayer.getPlayerName());
    System.out.println("Player type:" + cricketPlayer.getType());
    cricketPlayer.score();
    System.out.println();
    System.out.println("Player Number:" + badmintonPlayer.getPlayerNumber());
    System.out.println("Player Name:" + badmintonPlayer.getPlayerName());
    System.out.println("Player type:" + badmintonPlayer.getType());
    badmintonPlayer.score();
  }
}