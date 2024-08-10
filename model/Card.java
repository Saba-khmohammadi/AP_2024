package model;

public class Card {
    private final String name;
    private final int power;
    private final int numberOfCardsInTheGame;
    private final String type;
    private final String abillity;
    private final String description;
    private final boolean isHero;
    private final String fraction;
    public Card (String name, int power, int numberOfCardsInTheGame,
                 String type, String abillity, String description, boolean isHero, String fraction){
        this.name = name;
        this.abillity = abillity;
        this.type = type;
        this.power = power;
        this.description = description;
        this.numberOfCardsInTheGame = numberOfCardsInTheGame;
        this.isHero = false;
        this.fraction = fraction;
    }
    public String getName(){
        return name;
    }
    public String getAbilllity(){
        return abillity;
    }
    public String type(){
        return type;
    }
    public int getPower(){
        return power;
    }

}
