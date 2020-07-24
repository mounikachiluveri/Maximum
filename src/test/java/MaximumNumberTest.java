import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    @Test
    public void givenIntegerAtFirstNumberMax_ShouldReturnTrue() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int maximum = maximumNumber.testMaximum(92, 12, 34);
        Assert.assertEquals(92, maximum);
    }

    @Test
    public void givenIntegerAtSecondNumberMax_ShouldReturnTrue() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int maximum = maximumNumber.testMaximum(12, 95, 34);
        Assert.assertEquals(95, maximum);
    }

    @Test
    public void givenIntegerAtThirdNumberMax_ShouldReturnTrue() {
        MaximumNumber maximumNumber = new MaximumNumber();
        int maximum = maximumNumber.testMaximum(12, 34, 87);
        Assert.assertEquals(87, maximum);
    }

    @Test
    public void givenFloatAtFirstNumberMax_ShouldReturnTrue() {
        MaximumNumber maximumNumber = new MaximumNumber();
        float maximum = maximumNumber.testMaximum(12.0f, 11.0f, 10.0f);
        Assert.assertEquals(12.0f, maximum, 0.0);
    }

    @Test
    public void givenFloatAtSecondNumberMax_ShouldReturnTrue() {
        MaximumNumber maximumNumber = new MaximumNumber();
        float maximum = maximumNumber.testMaximum(11.0f, 12.0f, 10.0f);
        Assert.assertEquals(12.0f, maximum, 0.0);
    }

    @Test
    public void givenFloatAtThirdNumberMax_ShouldReturnTrue() {
        MaximumNumber maximumNumber = new MaximumNumber();
        float maximum = maximumNumber.testMaximum(11.0f, 10.0f, 12.0f);
        Assert.assertEquals(12.0f, maximum, 0.0);
    }

    @Test
    public void givenStringAtFirstPostionMax_ShouldReturnTrue() {
        MaximumNumber maximumNumber = new MaximumNumber();
        String maximum = maximumNumber.testMaximum("Peach", "Apple", "Banana");
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenStringAtSecondPositionMax_ShouldReturnTrue() {
        MaximumNumber maximumNumber = new MaximumNumber();
        String maximum = maximumNumber.testMaximum("Apple", "Peach", "Banana");
        Assert.assertEquals("Peach", maximum);
    }

    @Test
    public void givenStringAtThirdPositionMax_ShouldReturnTrue() {
        MaximumNumber maximumNumber = new MaximumNumber();
        String maximum = maximumNumber.testMaximum("Apple", "Banana", "Peach");
        Assert.assertEquals("Peach", maximum);
    }
}
