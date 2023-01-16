// Найти n-ое число Фибоначчи за O(n).

package algorithms.lesson1;

import java.util.concurrent.atomic.AtomicInteger;

public class Task02 {

    public static void main(String[] args) {
        int position = 1;
        int fib = fibonacci(position);
        System.out.println("Число Фибоначчи на позиции " + position + " равно " + fib);
    }

    public static int fibonacci(int n) {

        if (n < 1) {
            throw new IllegalArgumentException("Incorrect number!");
        }
        if (n == 1) {
            return 0;
        }

        int[] cache = new int[n];

        cache[0] = 1;
        cache[1] = 1;

        for (int i = 2; i < n; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }

        return cache[n - 2];

    }

}
