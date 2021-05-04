import java.util.ArrayList;

public class Categorie {

    private String name;
    private ArrayList<Game> games;

    public Categorie(String name){
        this.name = name;
        this.games = new ArrayList<>();

    }

    public static void getCatergories(ArrayList<Categorie>categorien){

        for (Categorie b : categorien) {
            System.out.println(b.getName());
        }
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

