// Класс Notebook содержит поля:
//
//Стоимость - price, double [100, 200, 300, 400, 500, 600, 700, 800]
//Оперативная память - ram, integer [4, 8, 16, 20, 24, 28, 32]
//Производитель - brand, enum Перечисление Brand может принимать следующие значения: Lenuvo, Asos, MacNote, Eser, Xamiou.
//Сортировать нужно в этом же порядке (т.е. Lenuvo имеет наивысший приоритет).
//Отсортировать по стоимости, по памяти, по перечислению (в таком порядке)

package algorithms.lesson2;

import java.util.*;

public class Task01 {
    public static void main(String[] args) {

        Laptop[] laptops  = new Laptop[5];

        laptops[0] = new Laptop(0, "Lenovo", 1999.99, 16);
        laptops[1] = new Laptop(1, "Lenovo", 2999.99, 4);
        laptops[2] = new Laptop(2, "Aenovo", 99.99, 32);
        laptops[3] = new Laptop(3, "Lenovo", 3999.99, 1);
        laptops[4] = new Laptop(4, "Lenovo", 99.99, 7);

        Arrays.sort(laptops);

        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }

    }
}
