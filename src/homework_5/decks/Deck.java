package homework_5.decks;

import java.util.Random;

public class Deck extends homework_5.containers.Container {
    static Random random1 = new Random();
    protected static String Deck;
    protected static int numberOfContainers;

    public static void loading() {
        int deck;
        deck = random1.nextInt(2);
        typeContainer();
        if (deck == 0 && containerBase == 20) {
            Deck = "Однопалубный ";
            numberOfContainers = 2;
        } else if (deck == 0 && containerBase == 10) {
            Deck = "Однопалубный ";
            numberOfContainers = 4;
        } else if (deck == 1 && containerBase == 20) {
            Deck = "Двухпалубный ";
            numberOfContainers = 8;
        } else if (deck == 1 && containerBase == 10) {
            Deck = "Двухпалубный ";
            numberOfContainers = 16;
        }
    }

}



