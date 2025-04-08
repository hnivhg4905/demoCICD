import org.example.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sum(2, 3), 5);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        Assert.assertEquals(calculator.sub(3, 3), 0);
    }
}
