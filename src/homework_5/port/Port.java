package homework_5.port;


public class Port extends homework_5.ships.Ship {

    static String[] arrShips = new String[10];
    static int totalMassOfWater = 0;


    public static void addShips() {

        for (int i = 0; i < arrShips.length; i++) {
            ship();
            arrShips[i] = Ship;
            totalMassOfWater = (int) (totalMassOfWater + (numberOfContainers * volume * DENSITY));
        }
        System.out.println("Общая масса воды: " + totalMassOfWater);
    }
}
