// Класс Laptop содержит поля:
//
//Стоимость - price, double [100, 200, 300, 400, 500, 600, 700, 800]
//Оперативная память - ram, integer [4, 8, 16, 20, 24, 28, 32]
//Производитель - brand, enum Перечисление Brand может принимать следующие значения: Lenuvo, Asos, MacNote, Eser, Xamiou.
//Сортировать нужно в этом же порядке (т.е. Lenuvo имеет наивысший приоритет).
//Отсортировать по стоимости, по памяти, по перечислению (в таком порядке)

package algorithms.lesson2;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Task01 {

    public static void main(String[] args) {

        double[] prices = new double[] {100, 200, 300, 400, 500, 600, 700, 800};
        int[] rams = new int[] {4, 8, 16, 20, 24, 28, 32};
        String[] brands = new String[] {"Lenuvo", "Asos", "MacNote", "Eser", "Xamiou"};

        Laptop[] laptops  = new Laptop[100];

        for (int i = 0; i < laptops.length; i++) {
            int randomPriceIndex = ThreadLocalRandom.current().nextInt(prices.length);
            int randomRamIndex = ThreadLocalRandom.current().nextInt(rams.length);
            int randomBrandIndex = ThreadLocalRandom.current().nextInt(brands.length);
            laptops[i] = new Laptop(
                    i,
                    new Pair<>(randomBrandIndex, brands[randomBrandIndex]),
                    prices[randomPriceIndex],
                    rams[randomRamIndex]);
        }

        /*Laptop[] laptops  = new Laptop[5];

        laptops[0] = new Laptop(0, new Pair<>(0, "Lenovo"), 1999.99, 4);
        laptops[1] = new Laptop(1, new Pair<>(3, "Aenovo"), 1999.99, 4);
        laptops[2] = new Laptop(2, new Pair<>(2, "Aenovo"), 1999.99, 4);
        laptops[3] = new Laptop(3, new Pair<>(1, "Lenovo"), 1999.99, 4);
        laptops[4] = new Laptop(4, new Pair<>(4, "Lenovo"), 1999.99, 4);*/

        Arrays.sort(laptops);

        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }

    }
}
