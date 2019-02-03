package pl.sii.tasks;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.TestInstance;
import pl.sii.secrets.SecretHelper;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
public class Task2Test {

    @Test
    public void test() {
        Task2 task2 = new Task2();
        task2.saveCase();
        Assert.assertEquals(SecretHelper.TASK2RESULT.getHelperValue(), task2.getController());
    }

}