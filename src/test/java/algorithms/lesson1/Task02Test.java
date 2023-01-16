package algorithms.lesson1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.*;

class Task02Test {

    @Test
    public void testFibonacciAcceptableNumbers() {

        int fib1 = Task02.fibonacci(1);
        int fib5 = Task02.fibonacci(5);
        int fib7 = Task02.fibonacci(7);

        Assertions.assertEquals(0, fib1);
        Assertions.assertEquals(3, fib5);
        Assertions.assertEquals(8, fib7);
    }

    @Test
    public void testFibonacciUnacceptableNumbers() {
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Task02.fibonacci(0));
        Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> Task02.fibonacci(-5));
    }

}