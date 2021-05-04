import java.util.ArrayList;

public class Game {

    private String name;
    private int price;
    private String information;
    private String genre;
    private Console playedOn;

    public Game(String name, int price, String information, String genre, Console playedOn){
        this.name = name;
        this.price = price;
        this.information = information;
        this.genre = genre;
        this.playedOn = playedOn;
    }

    public static void gameList(ArrayList<Game> games){

        for (Game c : games) {
            System.out.println("Game: " + c.getName() + " " + "\n" + "Price: " + c.getPrice() + " euros" + "\n" + "Information: " + c.getInformation() + "\n" + "Genre: " + c.getGenre());
            System.out.println();
        }
    }

    public int korting() {
        return this.price / 2;
    }

    public Console getPlayedOn() {
        return playedOn;
    }

    public void setPlayedOn(Console playedOn) {
        this.playedOn = playedOn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
