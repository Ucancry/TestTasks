import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskClassTest {
    TaskClass test = new TaskClass();
    @Test
    public void testMathSum() {
        int x = 2;
        int y = 2;
        int expectedSum = 4;
        int actualSum = test.mathSum(x , y);
        Assert.assertEquals(actualSum, expectedSum);
    }
}
