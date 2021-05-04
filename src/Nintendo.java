import java.util.ArrayList;

public  class Nintendo extends Console{

    private String nintendoController;

    public Nintendo(String name, String nintendoController) {
        super(name);
        this.nintendoController = nintendoController;
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
