

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;


public class FactorialTest {
    private final FactorialCalculator calculator = new FactorialCalculator();

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, FactorialCalculator.calculate(0), 1);
    }

    @Test
    public void testFactorialPositiveNumber() {

        Assert.assertEquals(FactorialCalculator.calculate(5), 120);
        Assert.assertEquals(FactorialCalculator.calculate(7), 5040);
    }

    @Test
    public void testFactorialofOne() {
        Assert.assertEquals(FactorialCalculator.calculate(1), 2);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        FactorialCalculator.calculate(-1);
    }

}

