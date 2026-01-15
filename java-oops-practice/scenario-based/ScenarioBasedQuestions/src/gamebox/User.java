package gamebox;

import java.util.ArrayList;

public class User {

    private String username;
    private ArrayList<Game> ownedGames;   // Encapsulation

    public User(String username) {
        this.username = username;
        this.ownedGames = new ArrayList<>();
    }

    public void buyGame(Game game) {
        ownedGames.add(game);
        System.out.println(game.title + " added to " + username + "'s library.");
    }

    public void showOwnedGames() {
        System.out.println("\nOwned Games:");
        for (Game g : ownedGames) {
            System.out.println("- " + g.title);
        }
    }
}

