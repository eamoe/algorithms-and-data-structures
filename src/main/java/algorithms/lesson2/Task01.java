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

        Laptop[] laptops  = new Laptop[10000];

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

        Arrays.sort(laptops);

        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }

    }
}
