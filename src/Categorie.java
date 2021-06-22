import java.util.ArrayList;

public class Categorie {

    private String name;
    private ArrayList<Game> games;

    public Categorie(String name){
        this.name = name;
        this.games = new ArrayList<>();

    }

    public static void allCategories() {
        Categorie categorie = new Categorie("Action games");
        Categorie categorie1 = new Categorie("Sport games");

        System.out.println(categorie.getName() + "\n" + categorie1.getName());
    }

    public void addGame(Game game){
        games.add(game);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Game> getGames() {
        return games;
    }

    public void setGames(ArrayList<Game> games) {
        this.games = games;
    }
}

