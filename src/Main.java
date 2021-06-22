import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        User user = new User("Serdin", 20, 15 - 10 - 2000, "Delft");
        User user1 = new User("Jaap", 24, 12 - 1 - 1996, "Rotterdam");
        User user2 = new User("Kees", 17, 26 - 10 - 2003, "Den haag");
        User user3 = new User("Hans", 21, 8 - 8 - 1999, "Zoetermeer");

        Korting klant = new Korting(60, 46, 46);
        Korting klant1 = new Korting(24, 29, 29);
        Korting klant2 = new Korting(0, 1, 1);
        Korting klant3 = new Korting(12, 5, 5);

        user.addUser(klant);
        user1.addUser(klant1);
        user2.addUser(klant2);
        user3.addUser(klant3);

        System.out.println("User: ");
        String inputUser = scanner.nextLine();

        if (inputUser.equals(user.getName())) {
            System.out.println(user.toString() + "\n" + klant.toString());
        } else if (inputUser.equals(user1.getName())) {
            System.out.println(user1.toString() + "\n" + klant1.toString());
        } else if (inputUser.equals(user2.getName())) {
            System.out.println(user2.toString() + "\n" + klant2.toString());
        } else if (inputUser.equals(user3.getName())) {
            System.out.println(user3.toString() + "\n" + klant3.toString());
        } else {
            System.out.println("Foute invoer");
        }

        System.out.println();
        System.out.println("Kies een console: ");
        String inputConsole = scanner.nextLine();
        Categorie.allCategories();

        System.out.println();
        System.out.println("Kies een categorie: ");
        String inputCategorie = scanner.nextLine();

        if (inputConsole.equals("Ps4") && inputCategorie.equals("Action games")) {
            Ps4.allActionGamesPs4();
        } else if (inputConsole.equals("Ps4") && inputCategorie.equals("Sport games")){
            Ps4.allSportGamesPs4();
        } else if (inputConsole.equals("Xbox") && inputCategorie.equals("Action games")){
            Xbox.allActionGamesXbox();
        } else if (inputConsole.equals("Xbox") && inputCategorie.equals("Sport games")){
            Xbox.allSportGamesXbox();
        } else if (inputConsole.equals("Pc") && inputCategorie.equals("Action games")) {
            Pc.allActionGamesPc();
        } else if (inputConsole.equals("Pc") && inputCategorie.equals("Sport games")) {
            Pc.allSportGamesPc();
        } else if (inputConsole.equals("Nintendo") && inputCategorie.equals("Action games")) {
            Nintendo.allActionGamesNintendo();
        } else if (inputConsole.equals("Nintendo") && inputCategorie.equals("Sport games")) {
            Nintendo.allSportGamesNintendo();
        } else {
            System.out.println("Foute input");
        }

        System.out.println();
        System.out.println("Customer Discount: ");
        if (inputUser.equals(user.getName())) {
            System.out.println(klant.allDiscounts() + "euro");
        }else if (inputUser.equals(user1.getName() + "euro")){
            System.out.println(klant1.allDiscounts() + "euro");
        }else if (inputUser.equals(user2.getName() + "euro")){
            System.out.println(klant2.allDiscounts() + "euro");
        }else if (inputUser.equals(user3.getName() + "euro")){
            System.out.println(klant3.allDiscounts() + "euro");
        }
    }
}