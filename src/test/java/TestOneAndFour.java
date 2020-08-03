import hw6.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestOneAndFour {

    private Integer[] a;
    private boolean b;

    public TestOneAndFour (Integer[] a, Boolean b){

        this.a = a;
        this.b = b;

    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {

        return Arrays.asList(new Object[][]{
                {new Integer[]{1, 1, 1, 1}, false},
                {new Integer[]{4, 4, 4, 4}, false},
                {new Integer[]{1, 4, 1, 4, 4, 1, 1}, true },
                {new Integer[]{4, 4, 1, 4, 3}, false},
                {new Integer[]{4, 1}, true},
                {new Integer[]{3, 2, 5, 6}, false},
        });
    }

    @Test
    public void testMethod() {
        Assert.assertEquals(Main.checkOneAndFour(a), b);
    }




}
