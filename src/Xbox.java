import java.util.ArrayList;

public  class Xbox extends Console{

    private String xboxController;

    public Xbox(String name, String xboxController) {
        super(name);
        this.xboxController = xboxController;
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

