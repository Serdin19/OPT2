import java.util.ArrayList;
import java.util.Arrays;

public class Ps4 extends Console{

    private String ps4Controller;

    public Ps4(String name, String ps4Controller) {
        super(name);
        this.ps4Controller = ps4Controller;
    }

    @Override
    public void designConsole(){
        System.out.println("Measurement ps4: " + "\n" + "Height: 2.09" + "Depht: 12" + "Width: 10.8" + "Weight: 6.3 lb");
    }


    public static void exclusivePs4Games(ArrayList<Game> ps4Games) {

        for (Game a : ps4Games) {
            System.out.println("Game: " + a.getName() + " " + "\n" + "Price: " + a.getPrice() + " euros" + "\n" + "Information: " + a.getInformation() + "\n" + "Genre: " + a.getGenre());
            System.out.println();
        }
    }


    public String getPs4Controller() {
        return ps4Controller;
    }

    public void setPs4Controller(String ps4Controller) {
        this.ps4Controller = ps4Controller;
    }
}