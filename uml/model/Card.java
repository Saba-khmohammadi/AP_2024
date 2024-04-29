package model;

public class Card {
    private String name;
    private int power;
    private int numberOfCardsInTheGame;
    private String type;
    private String abillity;
    private String description;
    private boolean isHero;
    private String fraction;
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
