package pl.sii.intro;


import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
public class StringsConcatenationsTest {

    private StringsConcatenations stringConcatenation;

    @BeforeAll
    public void setUp() {
        stringConcatenation = new StringsConcatenations();
    }

    @Test
    public void testStringConcatenation() {
        long startTime = System.nanoTime();
        stringConcatenation.stringConcatenation();
        long endTime = System.nanoTime();

        long duration = (endTime - startTime);
        Assert.assertTrue(duration < 1000000);
    }
}
