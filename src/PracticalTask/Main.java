package PracticalTask;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Задание 1

        Scanner scanner = new Scanner(System.in);
        System.out.print(" Введите порядковый номер месяца: ");
        int monthNumber = scanner.nextInt();

       if (monthNumber > 0 && monthNumber <= 2 || monthNumber == 12){
           System.out.println("Зима");
        }  else if (monthNumber > 2 && monthNumber <= 5){
           System.out.println("Весна");
       } else if (monthNumber > 5 && monthNumber <= 8){
           System.out.println("Лето");
       } else if (monthNumber > 8 && monthNumber < 12){
           System.out.println("Осень");
       } else {
           System.out.println("Месяца с таким пордяковым номером не существует");
       }

//        Задание 2

        Scanner scanner2 = new Scanner(System.in);
        System.out.print(" Введите число: ");
        int number = scanner.nextInt();
        int lastDigit = number % 10;

        if (lastDigit == 3) {
            System.out.println("Последняя цифра 3");
        } else {
            System.out.println("Последняя цифра не является 3");
        }

//        Задание 3

        Scanner scanner3 = new Scanner(System.in);
        System.out.print(" Введите число, а я добавлю ' рубль', ' рубля', ' рублей': ");
        int money = scanner.nextInt();
        int moneyRubble = money % 10;

        if (money >= 5
                && money <= 20
                || moneyRubble == 5
                || moneyRubble == 6
                || moneyRubble == 7
                || moneyRubble == 8
                || moneyRubble == 9
                || moneyRubble == 0) {
            System.out.println(money + " рублей");
        } else if (moneyRubble == 1) {
            System.out.println(money + " рубль");
        } else {
            System.out.println(money + " рубля");
        }

//        Задание 4

        Scanner scanner4 = new Scanner(System.in);
        System.out.print(" Введите год, а я скажу, високосный ли он: ");
        int year = scanner.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + " год високосный");
        } else if (year % 4 == 0 && year % 100 == 0) {
            System.out.println(year + " год не является вискокосным");
        } else if (year % 4 == 0) {
            System.out.println(year + " год високосный");
        } else {
            System.out.println(year + " год не является вискокосным");
        }
    }
}