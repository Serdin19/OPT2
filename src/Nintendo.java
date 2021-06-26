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
        Game game = new Game("Mario", 10, "Action");
        Game game1 = new Game("Smash bros", 30, "Action");

        consoles.add(nintendo);
        nintendoGames.add(game);
        nintendoGames.add(game1);
        System.out.println("Name: " + game.getName() + "\n" + "Price: " + game.getPrice() + "\n" + "Information: " + "\n" + "Genre: " + game.getGenre() + "\n" + "\n" + "Name: " + game1.getName() + "\n" + "Price: " + game1.getPrice() + "\n" + "Information: " + "\n" + "Genre: " + game1.getGenre());
    }
    public static void allSportGamesNintendo() {
        Nintendo nintendo = new Nintendo("Nintendo", "aesthetics");
        Game game2 = new Game("Fifa 21", 20, "Sport");
        Game game3 = new Game("NBA2K", 20, "Sport");

        consoles.add(nintendo);
        nintendoGames.add(game2);
        nintendoGames.add(game3);
        System.out.println("Name: " + game2.getName() + "\n" + "Price: " + game2.getPrice() + "\n" + "Information: " + "\n" + "Genre: " + game2.getGenre() + "\n" + "\n" + "Name: " + game3.getName() + "\n" + "Price: " + game3.getPrice() + "\n" + "Information: " + "\n" + "Genre: " + game3.getGenre());
    }

    @Override
    public void designConsole(){
        System.out.println("Measurement nintendo: " + "\n" + "Height: 2.09" + "Depht: 12" + "Width: 10.8" + "Weight: 6.3 lb");
    }

    public String getNintendoController() {
        return nintendoController;
    }

    public void setNintendoController(String nintendoController) {
        this.nintendoController = nintendoController;
    }
}
