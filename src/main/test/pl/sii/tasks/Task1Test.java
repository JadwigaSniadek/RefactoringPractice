package pl.sii.tasks;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task1Test {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new Params(8, 8, 8), false},
                {new Params(6, 10, 10), false},
                {new Params(10, 4, 10), false},
                {new Params(10, 10, 2), false},
                {new Params(0, 0, 0), true},
                {new Params(-2, -10, -2), true}
        });
    }

    private boolean testResult;
    private Params params;

    private static class Params{
        int a, b, c;

        public Params(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }

    public Task1Test(Params params, boolean testResult) {
        this.testResult = testResult;
        this.params = params;
    }

    @Test
    public void test() {
        Assert.assertEquals(Task1.areAllLessThenCosiek(params.a, params.b, params.c), testResult);
    }
}