// Класс Notebook содержит поля:
//
//Стоимость - price, double [100, 200, 300, 400, 500, 600, 700, 800]
//Оперативная память - ram, integer [4, 8, 16, 20, 24, 28, 32]
//Производитель - brand, enum Перечисление Brand может принимать следующие значения: Lenuvo, Asos, MacNote, Eser, Xamiou.
//Сортировать нужно в этом же порядке (т.е. Lenuvo имеет наивысший приоритет).
//Отсортировать по стоимости, по памяти, по перечислению (в таком порядке)

package algorithms.lesson2;

import java.util.HashSet;
import java.util.Set;

public class Task01 {
    public static void main(String[] args) {

        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Lenovo", 1999.99, 16));
        laptops.add(new Laptop("Lenovo", 1999.99, 4));
        laptops.add(new Laptop("Lenovo", 1999.99, 7));
        laptops.add(new Laptop("Lenovo", 1999.99, 1));
        laptops.add(new Laptop("Lenovo", 1999.99, 32));

        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }

    }
}
