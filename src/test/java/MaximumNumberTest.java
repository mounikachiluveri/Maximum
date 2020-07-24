import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    @Test
    public void givenIntegerAtFirstNumberMax_ShouldReturnTrue() {
        Assert.assertEquals(92,new MaximumNumber(92,12,34).testMaximum());
    }

    @Test
    public void givenIntegerAtSecondNumberMax_ShouldReturnTrue() {
        Assert.assertEquals(95,new MaximumNumber(45,95,34).testMaximum());
    }

    @Test
    public void givenIntegerAtThirdNumberMax_ShouldReturnTrue() {
        Assert.assertEquals(92,new MaximumNumber(45,34,92).testMaximum());
    }

    @Test
    public void givenFloatAtFirstNumberMax_ShouldReturnTrue() {
        Assert.assertEquals(12.0f, new MaximumNumber(12.0f, 11.0f, 10.0f).testMaximum());
    }

    @Test
    public void givenFloatAtSecondNumberMax_ShouldReturnTrue() {
        Assert.assertEquals(12.0f, new MaximumNumber(11.0f, 12.0f, 10.0f).testMaximum());
    }

    @Test
    public void givenFloatAtThirdNumberMax_ShouldReturnTrue() {
        Assert.assertEquals(12.0f, new MaximumNumber(10.0f, 11.0f, 12.0f).testMaximum());
    }

    @Test
    public void givenStringAtFirstPostionMax_ShouldReturnTrue() {
        Assert.assertEquals("Peach",new MaximumNumber("Peach", "Apple", "Banana").testMaximum());
    }

    @Test
    public void givenStringAtSecondPositionMax_ShouldReturnTrue() {
        Assert.assertEquals("Peach",new MaximumNumber("Apple", "Peach", "Banana").testMaximum());
    }
    @Test
    public void givenStringAtThirdPositionMax_ShouldReturnTrue() {
        Assert.assertEquals("Peach",new MaximumNumber("Banana", "Apple", "Peach").testMaximum());
    }
}
