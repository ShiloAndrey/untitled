package homework_5.ships;


import java.util.Random;

public class Ship extends homework_5.decks.Deck {
    static String[] arrNameShips = {"Titanic", "Nina", "Pint", "Santa-Maria", "Queen Anne's Revenge", "Bismark", "Victory",
            "Enterprise", "Nautilus", "Black Pearl"};
    static Random random3 = new Random();

    protected String createShip;
    protected static String Ship;


    public static void ship() {
        loading();
        int numberName = random3.nextInt(9);
        int numberShip = random3.nextInt(9) + 1;
        String Name = arrNameShips[numberName] + "-" + numberShip;
        String createShip = "корабль " + "'" + Name + "'" + ", в который загружено ";
        Ship = Deck.concat(createShip).concat(String.valueOf(numberOfContainers)).concat(Container);

    }
}
