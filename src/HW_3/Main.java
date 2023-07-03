package HW_3;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();


        Cat cat = new Cat();
        String catName[] = {"Martin", "Tom", "Tim", "Gray", "Alex", "Shon", "Jerry", "Austin", "Sam", "Jasper"};

        System.out.println("\n Цикл 'while' с дефолтными значениеми \n");

        int i = 0;
        while (i < 10) {
            System.out.println(cat);
            i++;
        }

        System.out.println("\n Цикл 'for'\n");

        for (int j = 0; j < 10; j++) {
            int rAge = 1 + (int) (Math.random() * 28);
            int rName = (int) (Math.random() * 9);
            cat.setAge(rAge);
            cat.setName(catName[rName]);
            System.out.println(cat);
        }

        System.out.println("\n Цикл 'do while' \n");

        int i2 = 0;
        do {
            int rAge2 = 1 + (int) (Math.random() * 28);
            int rName2 = (int) (Math.random() * 9);
            Cat cat2 = new Cat(catName[rName2], rAge2);
            i2++;
            System.out.println(cat2);
        } while (i2 < 10);

        System.out.println("\n Цикл 'for-each' с дефолтными значениеми \n");

        Object[] arrCat = new Object[5];

        for (int x = 0; x < arrCat.length; x++) {
            int rAge = 1 + (int) (Math.random() * 28);
            int rName = (int) (Math.random() * 9);
            arrCat[x] = new Cat(catName[rName], rAge);
        }
        for (Object c : arrCat) {
            System.out.println(c);
        }
    }
}

