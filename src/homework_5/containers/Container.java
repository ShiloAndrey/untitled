package homework_5.containers;


import java.util.Random;

public class Container {
    static Random random = new Random();
    protected static String Container;
    protected static String TypeContainer;
    protected static double volume;
    protected static int containerBase = (random.nextInt(2) + 1) * 10;
    protected static final int DENSITY = (random.nextInt(2) + 1) * 1000;

    public static void typeContainer() {

        int containerHeight = random.nextInt(91) + 10;

        int typeContainer = random.nextInt(3) + 1;

        switch (typeContainer) {
            case 1:
                TypeContainer = "квадратных ";
                volume = (int) Math.pow((containerBase * Math.sqrt(2)), 2) * containerHeight;
                break;
            case 2:
                TypeContainer = "цилиндрических ";
                volume = (int) (Math.PI * (Math.pow((containerBase / 2), 2)) * containerHeight);
                break;
            case 3:
                TypeContainer = "конусных ";
                volume = (int) (Math.PI * (Math.pow((containerBase / 2), 2)) * containerHeight) / 3;
                break;
            default:
                System.out.println("Ошибка");
        }

        if (containerBase == 20) {
            Container = " больших "
                    + TypeContainer
                    + "контерйнера, объёмом "
                    + volume
                    + " и высотой "
                    + containerHeight
                    + " и заправлен водой плотностью: "
                    + DENSITY;
        } else {
            Container = " маленьких "
                    + TypeContainer
                    + "контейнера, объёмом "
                    + volume
                    + " и высотой "
                    + containerHeight
                    + " и заправлен водой плотностью: "
                    + DENSITY;
        }
    }
}
