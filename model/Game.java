package model;

import java.lang.invoke.StringConcatFactory;

public class Game {
    private final String firstPlayer;
    private final String secondPlayer;
    public static Game currentGame;
    public Game(String firstPlayer, String secondPlayer){
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }
}
