package pl.ing;


import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
public class CosiekTest {

    private Cosiek cosiek;

    @BeforeAll
    public void setUp() {
        cosiek = new Cosiek();
    }

    @Test
    public void testStringConcatenation() {
        long startTime = System.nanoTime();
        cosiek.stringConcatenation();
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        Assert.assertTrue(duration < 1000000);
    }
}
