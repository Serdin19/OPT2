import java.util.ArrayList;

public  class Pc extends Console{

    private String muis;
    private String keyboard;

    public Pc(String name, String muis, String keyboard) {
        super(name);
        this.muis = muis;
        this.keyboard = keyboard;
    }

    @Override
    public void designConsole(){
        System.out.println("Measurement pc: " + "\n" + "Height: 2.09" + "Depht: 12" + "Width: 10.8" + "Weight: 6.3 lb");
    }

    public static void exclusivePcGames(ArrayList<Game> pcGames) {

        for (Game f : pcGames) {
            System.out.println("Game: " + f.getName() + " " + "\n" + "Price: " + f.getPrice() + " euros" + "\n" + "Information: " + f.getInformation() + "\n" + "Genre: " + f.getGenre());
            System.out.println();
        }
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
