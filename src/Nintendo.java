import java.util.ArrayList;

public  class Nintendo extends Console{

    private String nintendoController;
    private static ArrayList<Game> nintendoGames;

    public Nintendo(String name, String nintendoController) {
        super(name);
        this.nintendoController = nintendoController;
        this.nintendoGames = new ArrayList<>();
    }

    public static void allActionGamesNintendo() {
        Nintendo nintendo = new Nintendo("Nintendo", "aesthetics");
        Game game = new Game("Mario", 10, "Open world", "Action", nintendo);
        Game game1 = new Game("Smash bros", 30, "Adventure", "Action", nintendo);

        consoles.add(nintendo);
        nintendoGames.add(game);
        nintendoGames.add(game1);
        System.out.println("Name: " + game.getName() + "\n" + "Price: " + game.getPrice() + "\n" + "Information: " + game.getInformation() + "\n" + "Genre: " + game.getGenre() + "\n" + "\n" + "Name: " + game1.getName() + "\n" + "Price: " + game1.getPrice() + "\n" + "Information: " + game1.getInformation() + "\n" + "Genre: " + game1.getGenre());
    }
    public static void allSportGamesNintendo() {
        Nintendo nintendo = new Nintendo("Nintendo", "aesthetics");
        Game game2 = new Game("Fifa 21", 20, "Sport", "Sport", nintendo);
        Game game3 = new Game("NBA2K", 20, "Sport", "Sport", nintendo);

        consoles.add(nintendo);
        nintendoGames.add(game2);
        nintendoGames.add(game3);
        System.out.println("Name: " + game2.getName() + "\n" + "Price: " + game2.getPrice() + "\n" + "Information: " + game2.getInformation() + "\n" + "Genre: " + game2.getGenre() + "\n" + "\n" + "Name: " + game3.getName() + "\n" + "Price: " + game3.getPrice() + "\n" + "Information: " + game3.getInformation() + "\n" + "Genre: " + game3.getGenre());
    }

    @Override
    public void designConsole(){
        System.out.println("Measurement nintendo: " + "\n" + "Height: 2.09" + "Depht: 12" + "Width: 10.8" + "Weight: 6.3 lb");
    }

    public static void exclusiveNintendoGames(ArrayList<Game> nintendoGames) {

        for (Game e : nintendoGames) {
            System.out.println("Game: " + e.getName() + " " + "\n" + "Price: " + e.getPrice() + " euros" + "\n" + "Information: " + e.getInformation() + "\n" + "Genre: " + e.getGenre());
            System.out.println();
        }
    }

    public String getNintendoController() {
        return nintendoController;
    }

    public void setNintendoController(String nintendoController) {
        this.nintendoController = nintendoController;
    }
}
