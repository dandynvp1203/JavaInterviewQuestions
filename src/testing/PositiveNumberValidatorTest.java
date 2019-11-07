package testing;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class PositiveNumberValidatorTest {

    //SUT = System under test
    PositiveNumberValidator SUT;

    @Before
    public void setup() {
        SUT = new PositiveNumberValidator();
    }

    @Test
    public void test1() {
        boolean result = SUT.isPositive(-1);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void test2() {
        boolean result = SUT.isPositive(0);
        Assert.assertThat(result, is(false));
    }

    @Test
    public void test3() {
        boolean result = SUT.isPositive(1);
        Assert.assertThat(result, is(true));
    }
 }