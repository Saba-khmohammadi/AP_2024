package model;

import java.util.*;

public class User {
    private String username;
    private String nickname;
    private double record;
    private int totalGamesPlayed;
    private int gamesWon;
    private int gamesLost;
    private int gamesTied;
    private String password;
    private static ArrayList<User> users;
    private static User loggedInUser;


    private String answerOfSecurityQuestion;

    private int numberOfSecurityQuestion;
    private ArrayList<Card> deckCards = new ArrayList<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        if (users == null) {
            users = new ArrayList<>();
        }
        users.add(this);
    }

    public void setAnswerOfSecurityQuestion(String answer){this.answerOfSecurityQuestion=answer;}

    public void setNumberOfSecurityQuestion(int number){this.numberOfSecurityQuestion=number;}

    public void setPassword(String password){this.password=password;}

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static User getUserByUsername(String username) {
        if (users != null) {
            for (User user : users) {
                if (user.getUsername().equals(username)) {
                    return user;
                }
            }
        }
        return null;
    }

    public static ArrayList<User> getUsers() {
        return users;
    }

    public static User getLoggedInUser() {
        return loggedInUser;
    }

    public static void setLoggedInUser(User user) {
        loggedInUser = user;
    }


}
