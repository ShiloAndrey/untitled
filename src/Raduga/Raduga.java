package Raduga;

import java.util.Scanner;

public class Raduga {

    private static final String wordColor = " цвет";

    // Красный - 1
    private static final String halfRed = "Красно-";
    private static final String Red = "Красный";

    // Оранжевый - 2
    private static final String halfOrange = "Оранжево-";
    private static final String Orange = "Оранжевый";

    // Желтый - 3
    private static final String halfYellow = "Желто-";
    private static final String Yellow = "Желтый";

    // Зеленый - 4
    private static final String halfGreen = "Зелено-";
    private static final String Green = "Зеленый";

    // Синий - 5
    private static final String halfBlue = "Сине-";
    private static final String Blue = "Синий";

    // Фиолетовый - 6
    private static final String halfViolet = "Фиолетово-";
    private static final String Violet = "Фиолетовый";

    // Создаем метод
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Я могу вывести название цвета согласно их номеру: 1 - Красный, 2 - Оранжевый, 3 - Желтый, " +
                "\n 4 - Зеленый, 5 - Синий, 6 - Фиолетовый. Цвета можно комбинировать.\n Введите число: ");
        int colorNumber = scanner.nextInt();


// Вывод простых цветов
        switch (colorNumber) {
            case 1:
                System.out.println(Red + wordColor);
                break;
            case 2:
                System.out.println(Orange + wordColor);
                break;
            case 3:
                System.out.println(Yellow + wordColor);
                break;
            case 4:
                System.out.println(Green + wordColor);
                break;
            case 5:
                System.out.println(Blue + wordColor);
                break;
            case 6:
                System.out.println(Violet + wordColor);
                break;
// Вывод полуцветов
            case 12:
                System.out.println(halfRed + Orange + wordColor);
                break;
            case 13:
                System.out.println(halfRed + Yellow + wordColor);
                break;
            case 14:
                System.out.println(halfRed + Green + wordColor);
                break;
            case 15:
                System.out.println(halfRed + Blue + wordColor);
                break;
            case 16:
                System.out.println(halfRed + Violet + wordColor);
                break;
            case 21:
                System.out.println(halfOrange + Red + wordColor);
                break;
            case 23:
                System.out.println(halfOrange + Yellow + wordColor);
                break;
            case 24:
                System.out.println(halfOrange + Green + wordColor);
                break;
            case 25:
                System.out.println(halfOrange + Blue + wordColor);
                break;
            case 26:
                System.out.println(halfOrange + Violet + wordColor);
                break;
            case 31:
                System.out.println(halfYellow + Red + wordColor);
                break;
            case 32:
                System.out.println(halfYellow + Orange + wordColor);
                break;
            case 34:
                System.out.println(halfYellow + Green + wordColor);
                break;
            case 35:
                System.out.println(halfYellow + Blue + wordColor);
                break;
            case 36:
                System.out.println(halfYellow + Violet + wordColor);
                break;
            case 41:
                System.out.println(halfGreen + Red + wordColor);
                break;
            case 42:
                System.out.println(halfGreen + Orange + wordColor);
                break;
            case 43:
                System.out.println(halfGreen + Yellow + wordColor);
                break;
            case 45:
                System.out.println(halfGreen + Blue + wordColor);
                break;
            case 46:
                System.out.println(halfGreen + Violet + wordColor);
                break;
            case 51:
                System.out.println(halfBlue + Red + wordColor);
                break;
            case 52:
                System.out.println(halfBlue + Orange + wordColor);
                break;
            case 53:
                System.out.println(halfBlue + Yellow + wordColor);
                break;
            case 54:
                System.out.println(halfBlue + Green + wordColor);
                break;
            case 56:
                System.out.println(halfBlue + Violet + wordColor);
                break;
            case 61:
                System.out.println(halfViolet + Red + wordColor);
                break;
            case 62:
                System.out.println(halfViolet + Orange + wordColor);
                break;
            case 63:
                System.out.println(halfViolet + Yellow + wordColor);
                break;
            case 64:
                System.out.println(halfViolet + Green + wordColor);
                break;
            case 65:
                System.out.println(halfViolet + Blue + wordColor);
                break;
            default:
                System.out.println("Такого цвета я не знаю");
        }
    }
}


