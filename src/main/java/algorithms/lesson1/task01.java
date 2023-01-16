// Рекурсивно найти n-ое число Фибоначчи.
// Определить сложность. (fn[0] = 0 или 1) [fn(n) = (fn(n - 1) + fn(n - 2)]

package algorithms.lesson1;

import java.util.concurrent.atomic.AtomicInteger;

public class task01 {

    public static void main(String[] args) {
        int position = 7;
        AtomicInteger counter = new AtomicInteger(0);
        int fib = fibonacci(position, counter);
        System.out.println("Число Фибоначчи на позиции " + position + " равно " + fib);
        System.out.println("Значение счетчика равно " + counter.get());
    }

    // Сложность алгоритма 2^n: каждое последующее значение приводит к
    // каскадному вызову еще двух рекурсивных функций.
    public static int fibonacci(int n, AtomicInteger counter) {
        counter.incrementAndGet();
        if (n < 1) {
            throw new RuntimeException("Incorrect number!");
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }

        return fibonacci(n - 1, counter) + fibonacci(n - 2, counter);
    }

}
