import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {
    private final FactorialCalculator calculator = new FactorialCalculator();

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.calculate(0));
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, FactorialCalculator.calculate(1));
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, FactorialCalculator.calculate(5)); // 5! = 120
        assertEquals(720, FactorialCalculator.calculate(6)); // 6! = 720
        assertEquals(5040, FactorialCalculator.calculate(7)); // 7! = 5040
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            FactorialCalculator.calculate(-1);
        });
        assertEquals("Число не должно быть отрицательным", exception.getMessage());
    }
}
