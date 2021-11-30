import jdk.nashorn.internal.ir.annotations.Ignore;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest {
    Calculate calcuate;
    @Test
    public void testAdd() {
        calcuate = new Calculate();
        int result = calcuate.add(3, 7);
        Assert.assertEquals(result,10);
    }
    @Test
    public void testSubtract() {
        calcuate = new Calculate();
        int result = calcuate.subtract(10, 2);
        Assert.assertEquals(result,8);
    }
    @Test
    public void testMultiply() {
        calcuate = new Calculate();
        int result = calcuate.multiply(4, 5);
        Assert.assertEquals(result, 20);
    }
    @Test
    public void testDivide() {
        calcuate = new Calculate();
        int result = calcuate.divide(18, 9);
        Assert.assertEquals(result, 2);
    }
}
