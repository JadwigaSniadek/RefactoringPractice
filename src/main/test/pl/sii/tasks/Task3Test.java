package pl.sii.tasks;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Task3Test {
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {LocalDate.of(YEAR, Month.MARCH, DAY), 1, 100},
                {LocalDate.of(YEAR, Month.APRIL, DAY), 1, 120},
                {LocalDate.of(YEAR, Month.MARCH, DAY), 5, 5*90},
                {LocalDate.of(YEAR, Month.APRIL, DAY), 5, 5*108},
                {LocalDate.of(YEAR, Month.MARCH, DAY), 4, 4*100},
                {LocalDate.of(YEAR, Month.APRIL, DAY), 4, 4*120},
                {LocalDate.of(YEAR, Month.OCTOBER, DAY), 5, 5*90},
                {LocalDate.of(YEAR, Month.SEPTEMBER, DAY), 5, 5*108}
        });
    }

    private static final int YEAR = 2018;
    private static final int DAY = 1;
    private static final double DELTA = 0.0;

    private double correctPrice;
    private LocalDate testDate;
    private int quantity;

    public Task3Test(LocalDate testDate, int quantity, double correctPrice) {
        this.testDate = testDate;
        this.quantity = quantity;
        this.correctPrice = correctPrice;
    }

    @Test
    public void test() {
        Assert.assertEquals(correctPrice, Task3.calculateTicketPrice(testDate, quantity), DELTA);
    }
}