import org.junit.Assert;
import org.junit.Test;
public class MaximumNumberTest
{
    @Test
    public void givenIntegerAtFirstNumberMax_ShouldReturnTrue() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Integer first=92;
        Integer maximum=maximumNumber.testMaximun(92, 12, 34);
        Assert.assertEquals(first,maximum);
    }

    @Test
    public void givenIntegerAtSecondNumberMax_ShouldReturnTrue() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Integer second=95;
        Integer maximum=maximumNumber.testMaximun(12, 95, 34);
        Assert.assertEquals(second,maximum);
    }

    @Test
    public void givenIntegerAtThirdNumberMax_ShouldReturnTrue() {
        MaximumNumber maximumNumber = new MaximumNumber();
        Integer Third=87;
        Integer maximum=maximumNumber.testMaximun(12, 34, 87);
        Assert.assertEquals(Third,maximum);
    }
}
