import java.util.ArrayList;

public  class Pc extends Console{

    private String muis;
    private String keyboard;
    private static ArrayList<Game> pcGames;

    public Pc(String name, String muis, String keyboard) {
        super(name);
        this.muis = muis;
        this.keyboard = keyboard;
        this.pcGames = new ArrayList<>();
    }


    public static void allActionGamesPc() {
        Pc pc = new Pc("Pc", "Razer", "gembird");
        Game game = new Game("Call of duty black ops", 20, "Multiplayer, Shooter", "Action", pc);
        Game game1 = new Game("Battlefield 4", 20, "Multiplayer, Shooter", "Action", pc);

        consoles.add(pc);
        pcGames.add(game);
        pcGames.add(game1);
        System.out.println("Name: " + game.getName() + "\n" + "Price: " + game.getPrice() + "\n" + "Information: " + game.getInformation() + "\n" + "Genre: " + game.getGenre() + "\n" + "\n" + "Name: " + game1.getName() + "\n" + "Price: " + game1.getPrice() + "\n" + "Information: " + game1.getInformation() + "\n" + "Genre: " + game1.getGenre());
    }

    public static void allSportGamesPc() {
        Pc pc = new Pc("Pc", "Razer", "gembird");
        Game game2 = new Game("Fifa 21", 50, "Multiplayer, Sport", "Sport", pc);
        Game game3 = new Game("NBA2K", 50, "Multiplayer, Sport", "Sport", pc);

        consoles.add(pc);
        pcGames.add(game2);
        pcGames.add(game3);
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
        System.out.println("Measurement pc: " + "\n" + "Height: 2.09" + "Depht: 12" + "Width: 10.8" + "Weight: 6.3 lb");
    }


    public String combineSet() {
        return this.muis + " & " + this.keyboard;
    }

    public String getMuis() {
        return muis;
    }

    public void setMuis(String muis) {
        this.muis = muis;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard)     {
        this.keyboard = keyboard;
    }
}
