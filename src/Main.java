import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Ps4 ps4 = new Ps4("Ps4", "aesthetics");
        Pc pc = new Pc("Pc", "Razer", "gembird");
        Xbox xbox = new Xbox("Xbox", "aesthetics");
        Nintendo nintendo = new Nintendo("Nintendo", "aesthetics");

        Game game = new Game("Call of duty black ops", 20, "Multiplayer, Shooter", "Action", pc);
        Game game1 = new Game("Battlefield 4", 20, "Multiplayer, Shooter", "Action", pc);
        Game game2 = new Game("Fifa 21", 50, "Multiplayer, Sport", "Sports", pc);

        Game game3 = new Game("Ghost of Tsushima", 40, "Open world", "Action", ps4);
        Game game4 = new Game("Spiderman", 50, "Open world", "Action", ps4);
        Game game5 = new Game("Last of Us", 20, "Open world", "Action", ps4);

        Game game6 = new Game("Halo 3", 10, "Open world", "Action", xbox);
        Game game7 = new Game("Forza Horizon 4", 30, "Race", "Sport", xbox);
        Game game8 = new Game("Gears 5", 20, "Open world", "Action", xbox);

        Game game9 = new Game("Mario", 10, "Open world", "Action", nintendo);
        Game game10 = new Game("Smash bros", 30, "Race", "Sport", nintendo);
        Game game11 = new Game("Luigi", 20, "Open world", "Action", nintendo);

        Game game12 = new Game("League of legends", 10, "Open world", "Action", pc);
        Game game13 = new Game("Valorant", 30, "Race", "Action", pc);
        Game game14 = new Game("Csgo", 20, "Open world", "Action", pc);


        ArrayList<Game> ps4Games = new ArrayList<Game>();

        ps4Games.add(game);
        ps4Games.add(game1);
        ps4Games.add(game2);
        ps4Games.add(game3);
        ps4Games.add(game4);
        ps4Games.add(game5);

        ArrayList<Game> xboxGames = new ArrayList<Game>();

        xboxGames.add(game);
        xboxGames.add(game1);
        xboxGames.add(game2);
        xboxGames.add(game6);
        xboxGames.add(game7);
        xboxGames.add(game8);

        ArrayList<Game> nintendoGames = new ArrayList<Game>();

        nintendoGames.add(game);
        nintendoGames.add(game1);
        nintendoGames.add(game2);
        nintendoGames.add(game9);
        nintendoGames.add(game10);
        nintendoGames.add(game11);

        ArrayList<Game> pcGames = new ArrayList<Game>();

        pcGames.add(game);
        pcGames.add(game1);
        pcGames.add(game2);
        pcGames.add(game12);
        pcGames.add(game13);
        pcGames.add(game14);

        Categorie categorie = new Categorie("Action games");
        Categorie categorie2 = new Categorie("Adventure games");
        Categorie categorie3 = new Categorie("Role-playing games");
        Categorie categorie4 = new Categorie("Simulation games");
        Categorie categorie5 = new Categorie("Strategy games");
        Categorie categorie6 = new Categorie("Sports games");
        Categorie categorie7 = new Categorie("Puzzle games");
        Categorie categorie8 = new Categorie("Idle games");


        categorie.addGame(game);
        categorie.addGame(game1);
        categorie.addGame(game2);
        categorie.addGame(game3);
        categorie.addGame(game4);
        categorie.addGame(game5);
        categorie.addGame(game6);
        categorie.addGame(game7);
        categorie.addGame(game8);
        categorie.addGame(game9);
        categorie.addGame(game10);
        categorie.addGame(game11);
        categorie.addGame(game12);
        categorie.addGame(game13);
        categorie.addGame(game14);


        ArrayList<Categorie> categorien = new ArrayList<Categorie>();

        categorien.add(categorie);
        categorien.add(categorie2);
        categorien.add(categorie3);
        categorien.add(categorie4);
        categorien.add(categorie5);
        categorien.add(categorie6);
        categorien.add(categorie7);
        categorien.add(categorie8);

        ArrayList<Console> consoles = new ArrayList<Console>();

        consoles.add(ps4);
        consoles.add(xbox);
        consoles.add(pc);
        consoles.add(nintendo);


        Scanner scanner = new Scanner(System.in);

        System.out.println("------------------------------------------------");
        Console.getConsoles(consoles);
        System.out.println("------------------------------------------------");
        System.out.println("Kies een console: ");
        System.out.println("------------------------------------------------");
        
        String inputConsole = scanner.nextLine();

        if (inputConsole.equals(ps4.getName())) {
            for (int i = 0; i < ps4Games.size(); i++) {
                System.out.println(ps4Games.get(i).getName());
            }
        } else if (inputConsole.equals(xbox.getName())) {
            for (int i = 0; i < xboxGames.size(); i++) {
                System.out.println(xboxGames.get(i).getName());
            }
        } else if (inputConsole.equals(pc.getName())) {
            for (int i = 0; i < pcGames.size(); i++) {
                System.out.println(pcGames.get(i).getName());
            }
        } else if (inputConsole.equals(nintendo.getName())) {
            for (int i = 0; i < nintendoGames.size(); i++) {
                System.out.println(nintendoGames.get(i).getName());
            }
        } else {
            System.out.println("Foute invoer!");
        }

        System.out.println("------------------------------------------------");
        Categorie.getCatergories(categorien);
        System.out.println("------------------------------------------------");
        System.out.println("Kies een categorie: ");
        System.out.println("------------------------------------------------");
        String input = scanner.nextLine();

        if (input.equals(categorie.getName()) && inputConsole.equals(ps4.getName())) {
            System.out.println("Action games");
            for (Game a : ps4Games) {
                System.out.println();
                System.out.println("Name: " + a.getName());
                System.out.println("Price: " + a.getPrice() + " Euro");
                System.out.println("Information: " + a.getInformation());
                System.out.println("Genre: " + a.getGenre());
                System.out.println("Console: " + a.getPlayedOn().getName());
                System.out.println();
                ps4.ps4Specs();
                System.out.println("------------------------------------------------");
            }
        } else if (input.equals(categorie.getName()) && inputConsole.equals(xbox.getName())) {
            System.out.println("Action games");
            for (Game b : xboxGames) {
                System.out.println();
                System.out.println("Name: " + b.getName());
                System.out.println("Price: " + b.getPrice() + " Euro");
                System.out.println("Information: " + b.getInformation());
                System.out.println("Genre: " + b.getGenre());
                System.out.println("Console: " + b.getPlayedOn().getName());
                System.out.println();
                xbox.xboxSpecs();
                System.out.println("------------------------------------------------");
            }
        } else if (input.equals(categorie.getName()) && inputConsole.equals(pc.getName())) {
            System.out.println("Action games");
            for (Game c : pcGames) {
                System.out.println();
                System.out.println("Name: " + c.getName());
                System.out.println("Price: " + c.getPrice() + " Euro");
                System.out.println("Information: " + c.getInformation());
                System.out.println("Genre: " + c.getGenre());
                System.out.println("Console: " + c.getPlayedOn().getName());
                System.out.println();
                pc.pcSpecs();
                System.out.println("------------------------------------------------");
            }
        } else if (input.equals(categorie.getName()) && inputConsole.equals(nintendo.getName())) {
            System.out.println("Action games");
            for (Game d : nintendoGames) {
                System.out.println();
                System.out.println("Name: " + d.getName());
                System.out.println("Price: " + d.getPrice() + " Euro");
                System.out.println("Information: " + d.getInformation());
                System.out.println("Genre: " + d.getGenre());
                System.out.println("Console: " + d.getPlayedOn().getName());
                System.out.println();
                nintendo.nintendoSpecs();
                System.out.println("------------------------------------------------");
            }

        } else if (input.equals(categorie2.getName())) {
            System.out.println("Adventure games");
        } else if (input.equals(categorie3.getName())) {
            System.out.println("Role-playing games");
        } else if (input.equals(categorie4.getName())) {
            System.out.println("Simulation games");
        } else if (input.equals(categorie5.getName())) {
            System.out.println("Strategy games");
        } else if (input.equals(categorie6.getName())) {
            System.out.println("Sports games");
        } else if (input.equals(categorie7.getName())) {
            System.out.println("Puzzle games");
        } else if (input.equals(categorie8.getName())) {
            System.out.println("Idle games");
        } else {
            System.out.println("Foute input");
        }

    }

}

