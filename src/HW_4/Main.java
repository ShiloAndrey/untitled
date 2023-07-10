package HW_4;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String[][] arr = new String[10][10];
        String allLetters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random random = new Random();
        final String REGEX = "[a-zA-Z]+";
        Pattern pattern = Pattern.compile(REGEX);


        int cycle = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (cycle % 3 == 0) {
                    double randomDouble = random.nextDouble(10);
                    String formattedDouble = String.format("%.5f", randomDouble);
                    arr[i][j] = formattedDouble;
                } else {
                    StringBuilder randomString = new StringBuilder();
                    for (int i1 = 0; i1 < 7; i1++) {
                        int randomIndex = random.nextInt(allLetters.length());
                        String randomLetter = allLetters.substring(randomIndex, randomIndex + 1);
                        randomString.append(randomLetter);
                        arr[i][j] = randomString.toString();
                    }
                }
                cycle++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        int x = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int cycle1 = 0;
            if (cycle1 == 10) {
                System.out.println("Это невероятно, но диагонали равны!");
            } else if (arr[i][i].equals(arr[i][x])) {
                cycle1++;
                x--;
            } else {
                System.out.println("Конечно же, диагонали не равны)");
            } break;
            }

        String[] arrNew = new String[20];

        for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i][i];
                arrNew[i+10] = arr[i][x];
                x--;
            }
        Double[] arrNumb = new Double[3];
        for (int i = 0; i < arrNew.length; i++) {
            String element = arrNew[i];
            Matcher matcher = pattern.matcher(element);

            if (matcher.find() == true) {
                String newString = element.substring(1, 4);
                System.out.print(newString + ", ");
            } else {
                for (int j = 0; j < arrNumb.length; j++) {
                    arrNumb[j] = Double.parseDouble(element);
                }
            }
        }
        }
    }








