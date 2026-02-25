package Quetion1;

public class Game {
    private String gameName;
    private String authorName;
    private float price;

    public Game(String gameName, String authorName, float price) {
        this.gameName = gameName;
        this.authorName = authorName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Game{" +
                "gameName='" + gameName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", price=" + price +
                '}';
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getGameName() {
        return gameName;
    }
}
