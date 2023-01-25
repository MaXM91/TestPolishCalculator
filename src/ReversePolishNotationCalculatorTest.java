
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    public void shouldCalculateAdditionPlus() {
        String x = "1 1 +";
        int solve = calculator.calculatePolishNotation(x);

        Assertions.assertEquals(2, solve);
    }

    @Test
    public void shouldCalculateAdditionMinus() {
        String x = "1 1 -";
        int solve = calculator.calculatePolishNotation(x);

        Assertions.assertEquals(0, solve);
    }

    @Test
    public void shouldCalculateAdditionMulti() {
        String x = "1 1 *";
        int solve = calculator.calculatePolishNotation(x);

        Assertions.assertEquals(1, solve);
    }

    @Test
    public void shouldCalculateAdditionBlank() {
        String x = "1    1          *";
        int solve = calculator.calculatePolishNotation(x);

        Assertions.assertEquals(1, solve);
    }

    @Test
    public void shouldCalculateAdditionNegative() {
        String x = "1 -4 *";
        int solve = calculator.calculatePolishNotation(x);

        Assertions.assertEquals(-4, solve);
    }

}

