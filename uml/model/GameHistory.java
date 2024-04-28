package model;

import java.util.ArrayList;
import java.util.Date;

public class GameHistory {
    private User firstPlayer;
    private User secondPlayer;
    private Date date;
    private double firstPlayerFinalScore;
    private double secondPlayerFinalScore;
    private User winner;
    private ArrayList<Double> firstPlayerScoresEachRound = new ArrayList<>();
    private ArrayList<Double> secondPlayerScoresEachRound = new ArrayList<>();
    //TODO:each round score

    private static ArrayList<GameHistory> allGames = new ArrayList<>();

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
