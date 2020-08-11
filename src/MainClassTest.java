import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    @Test
    public void testGetLocalNumber()
    {
        MainClass main = new MainClass();

        int result = main.getLocalNumber();
        Assert.assertEquals("Метод возвращает не 14", 14, result);
    }

    @Test
    public void testGetClassNumber()
    {
        MainClass main = new MainClass();

        int result = main.getClassNumber();
        int actualClassValue = 45;
        Assert.assertTrue("Метод возвращает число меньше 45", result > actualClassValue);
    }
}
