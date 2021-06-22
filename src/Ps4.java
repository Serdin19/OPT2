import java.util.ArrayList;
import java.util.Arrays;

public class Ps4 extends Console {

    private String ps4Controller;
    private static ArrayList<Game> ps4Games;

    public Ps4(String name, String ps4Controller) {
        super(name);
        this.ps4Controller = ps4Controller;
        this.ps4Games = new ArrayList<>();
    }

    @Override
    boolean logIn(String userName, String password) {
        return false;
    }

    @Override
    boolean sendData(byte[] data) {
        return false;
    }

    @Override
    void logOut() {

    }

    @Override
    public void designConsole() {
        System.out.println("Measurement ps4: " + "\n" + "Height: 2.09" + "Depht: 12" + "Width: 10.8" + "Weight: 6.3 lb");
    }



    public static void allActionGamesPs4() {
        Ps4 ps4 = new Ps4("Ps4", "aesthetics");
        Game game = new Game("Ghost of Tsushima", 40, "Open world", "Action", ps4);
        Game game1 = new Game("Spiderman", 50, "Open world", "Action", ps4);

        consoles.add(ps4);
        ps4Games.add(game);
        ps4Games.add(game1);
        System.out.println("Name: " + game.getName() + "\n" + "Price: " + game.getPrice() + "\n" + "Information: " + game.getInformation() + "\n" + "Genre: " + game.getGenre() + "\n" + "\n" + "Name: " + game1.getName() + "\n" + "Price: " + game1.getPrice() + "\n" + "Information: " + game1.getInformation() + "\n" + "Genre: " + game1.getGenre());
    }

    public static void allSportGamesPs4() {
        Ps4 ps4 = new Ps4("Ps4", "aesthetics");
        Game game2 = new Game("Fifa 21", 20, "Sport", "Sport", ps4);
        Game game3 = new Game("NBA2k", 20, "Sport", "Sport", ps4);

        ps4Games.add(game2);
        ps4Games.add(game3);
        System.out.println("Name: " + game2.getName() + "\n" + "Price: " + game2.getPrice() + "\n" + "Information: " + game2.getInformation() + "\n" + "Genre: " + game2.getGenre() + "\n" + "\n" + "Name: " + game3.getName() + "\n" + "Price: " + game3.getPrice() + "\n" + "Information: " + game3.getInformation() + "\n" + "Genre: " + game3.getGenre());
    }

    public String getPs4Controller() {
        return ps4Controller;
    }

    public void setPs4Controller(String ps4Controller) {
        this.ps4Controller = ps4Controller;
    }
}