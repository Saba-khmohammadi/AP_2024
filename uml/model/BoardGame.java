package model;

import java.util.ArrayList;

public class BoardGame {
    private User user;
    private ArrayList<Card> siege = new ArrayList<>();
    private ArrayList<Card> ranged = new ArrayList<>();
    private ArrayList<Card> closeCombat = new ArrayList<>();
    private ArrayList<Card> burnedCards = new ArrayList<>();
    private ArrayList<Card> allCards = new ArrayList<>();
    private ArrayList<Card> cardsNotPlayed = new ArrayList<>();
    private ArrayList<Integer> scoresEachRound = new ArrayList<>();
    private int lives = 2;
    private int round = 1;
    private int siegeScore;
    private int rangedScore;
    private int closeCombatScore;
    private int countVetoCard = 0;
    private ArrayList<Card> cardsInHand = new ArrayList<>();
    private int totalScore;
    //TODO: leader card
    private ArrayList<Card> spellCards = new ArrayList<>();

    public void setCardsNotPlayed(ArrayList<Card> cardsNotPlayed) {
        this.cardsNotPlayed = cardsNotPlayed;
    }

    public void setAllCards(ArrayList<Card> allCards) {
        this.allCards = allCards;
    }

    public void removeFromBurnedCards(Card card) {
    }

    public void addToDeck(Card card) {
    }

    public void removeFromRemainingCards(Card card) {

    }

    public void addToBoardCards(Card card, int rowNumber) {

    }

    private ArrayList<Card> getRowByNumber(int number) {
        return null;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void setTotalScore(int totalScore) {
        this.totalScore = totalScore;
    }

    public void increaseSiegeRowScore(int score) {
        this.siegeScore += score;
    }

    public void increaseRangedRowScore(int score) {
        this.rangedScore += score;
    }

    public void increaseCloseCombatRowScore(int score) {
        this.closeCombatScore += score;
    }
    public void calculateScoreEachRound() {

    }
    public void increaseTotalScore() {

    }


}
