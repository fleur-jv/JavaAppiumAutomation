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
}