package model;

import java.util.ArrayList;
import java.util.Date;

public class GameHistory {
    private final User firstPlayer;
    private final User secondPlayer;
    private final Date date;
    private final double firstPlayerFinalScore;
    private final double secondPlayerFinalScore;
    private User winner;
    private ArrayList<Double> firstPlayerScoresEachRound = new ArrayList<>();
    private ArrayList<Double> secondPlayerScoresEachRound = new ArrayList<>();
    //TODO:each round score

    private static final ArrayList<GameHistory> allGames = new ArrayList<>();

    public GameHistory(User firstPlayer, User secondPlayer, Date date
            , double firstPlayerFinalScore, double secondPlayerFinalScore, ArrayList<Double> firstPlayerScoresEachRound
            , ArrayList<Double> secondPlayerScoresEachRound) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.date = date;
        this.firstPlayerFinalScore = firstPlayerFinalScore;
        this.secondPlayerFinalScore = secondPlayerFinalScore;
        this.firstPlayerScoresEachRound = firstPlayerScoresEachRound;
        this.secondPlayerScoresEachRound = secondPlayerScoresEachRound;
        allGames.add(this);
    }
}
