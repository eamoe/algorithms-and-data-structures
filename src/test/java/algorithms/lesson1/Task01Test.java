package algorithms.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

class Task01Test {

    @Test
    public void testFibonacciAcceptableNumbers() {

        int fib1 = Task01.fibonacci(1, new AtomicInteger(0));
        int fib5 = Task01.fibonacci(5, new AtomicInteger(0));
        int fib7 = Task01.fibonacci(7, new AtomicInteger(0));

        Assertions.assertEquals(0, fib1);
        Assertions.assertEquals(3, fib5);
        Assertions.assertEquals(8, fib7);
    }

    @Test
    public void testFibonacciUnacceptableNumbers() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Task01.fibonacci(0, new AtomicInteger(0)));
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Task01.fibonacci(-5, new AtomicInteger(0)));
    }

}