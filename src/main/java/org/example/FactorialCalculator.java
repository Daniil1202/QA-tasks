package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculator {
    private final FactorialNumber calculator = new FactorialNumber();

    @Test
    public void testFactorialOfZero()  {
        assertEquals(1,calculator.factorial(0));
    }
    @Test
    public void testFactorialOfOne()  {
        assertEquals(1,calculator.factorial(1));
    }
    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, calculator.factorial(5)); // 5! = 120
        assertEquals(720, calculator.factorial(6)); // 6! = 720
        assertEquals(5040, calculator.factorial(7)); // 7! = 5040
    }
    @Test
    public void testFactorialOfNegativeNumber(){
        Exception exception = assertThrows(IllegalArgumentException.class,()->{
            calculator.factorial(-1);
        });
        assertEquals("Число не должно быть отрицательным", exception.getMessage());
    }
}
