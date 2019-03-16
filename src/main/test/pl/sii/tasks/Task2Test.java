package pl.sii.tasks;

import org.junit.Assert;
import org.junit.Test;
import pl.sii.secrets.SecretHelperEnum;

public class Task2Test {

    @Test
    public void test() {
        Task2 task2 = new Task2();
        task2.saveCase();
        Assert.assertEquals(SecretHelperEnum.TASK2RESULT.getHelperValue(), task2.getController());
    }

}