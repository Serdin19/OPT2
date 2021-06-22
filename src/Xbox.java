import java.util.ArrayList;

public  class Xbox extends Console{

    private String xboxController;
    private static ArrayList<Game> xboxGames;

    public Xbox(String name, String xboxController) {
        super(name);
        this.xboxController = xboxController;
        this.xboxGames = new ArrayList<>();
    }


    public static void allActionGamesXbox() {
        Xbox xbox = new Xbox("Xbox", "aesthetics");
        Game game = new Game("Halo 3", 10, "Open world", "Action", xbox);
        Game game1 = new Game("Forza Horizon 4", 30, "Race", "Sport", xbox);

        consoles.add(xbox);
        xboxGames.add(game);
        xboxGames.add(game1);
        System.out.println("Name: " + game.getName() + "\n" + "Price: " + game.getPrice() + "\n" + "Information: " + game.getInformation() + "\n" + "Genre: " + game.getGenre() + "\n" + "\n" + "Name: " + game1.getName() + "\n" + "Price: " + game1.getPrice() + "\n" + "Information: " + game1.getInformation() + "\n" + "Genre: " + game1.getGenre());
    }

    public static void allSportGamesXbox() {
        Xbox xbox = new Xbox("Xbox", "aesthetics");
        Game game2 = new Game("Fifa 21", 20, "Sport", "Sport", xbox);
        Game game3 = new Game("NBA2k", 20, "Sport", "Sport", xbox);

        consoles.add(xbox);
        xboxGames.add(game2);
        xboxGames.add(game3);
        System.out.println("Name: " + game2.getName() + "\n" + "Price: " + game2.getPrice() + "\n" + "Information: " + game2.getInformation() + "\n" + "Genre: " + game2.getGenre() + "\n" + "\n" + "Name: " + game3.getName() + "\n" + "Price: " + game3.getPrice() + "\n" + "Information: " + game3.getInformation() + "\n" + "Genre: " + game3.getGenre());
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
    public void designConsole(){
        System.out.println("Measurement xbox: " + "\n" + "Height: 2.09" + "Depht: 12" + "Width: 10.8" + "Weight: 6.3 lb");
    }

    public static void exclusiveXboxGames(ArrayList<Game> xboxGames) {

        for (Game d : xboxGames) {
            System.out.println("Game: " + d.getName() + " " + "\n" + "Price: " + d.getPrice() + " euros" + "\n" + "Information: " + d.getInformation() + "\n" + "Genre: " + d.getGenre());
            System.out.println();
        }
    }

    public String getXboxController() {
        return xboxController;
    }

    public void setXboxController(String xboxController) {
        this.xboxController = xboxController;
    }
}

