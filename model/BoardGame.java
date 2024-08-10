package model;

import java.util.ArrayList;

public class BoardGame {
    private User user;
    private final ArrayList<Card> siege = new ArrayList<>();
    private final ArrayList<Card> ranged = new ArrayList<>();
    private final ArrayList<Card> closeCombat = new ArrayList<>();
    private final ArrayList<Card> burnedCards = new ArrayList<>();
    private ArrayList<Card> allCards = new ArrayList<>();
    private ArrayList<Card> cardsNotPlayed = new ArrayList<>();
    private final ArrayList<Integer> scoresEachRound = new ArrayList<>();
    private final int lives = 2;
    private final int round = 1;
    private int siegeScore;
    private int rangedScore;
    private int closeCombatScore;
    private final int countVetoCard = 0;
    private final ArrayList<Card> cardsInHand = new ArrayList<>();
    private int totalScore;
    //TODO: leader card
    private final ArrayList<Card> spellCards = new ArrayList<>();

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
