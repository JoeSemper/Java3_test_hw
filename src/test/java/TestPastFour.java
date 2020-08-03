import hw6.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestPastFour {

    private Integer[] a;
    private Integer[] b;

    public TestPastFour(Integer[] a, Integer[] b) {
        this.a = a;
        this.b = b;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Integer[]{1, 3, 5, 4, 6, 7}, new Integer[]{6, 7}},
                {new Integer[]{12, 4, 3, 8}, new Integer[]{3, 8}},
                {new Integer[]{5, 4, 2, 5, 7, 4, 3}, new Integer[]{3}},
                {new Integer[]{4}, new Integer[]{}},
        });
    }

    @Test
    public void testMethod() {
        Assert.assertArrayEquals(Main.getPastFour(a), b);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testException() {
        Main.getPastFour(new Integer[]{});
    }

    @Test(expected = RuntimeException.class)
    public void testRuntimeException() {
        Main.getPastFour(new Integer[]{1, 2, 3, 5, 6});
    }

}
