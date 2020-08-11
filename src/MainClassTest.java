import org.junit.Assert;
import org.junit.Test;

public class MainClassTest
{
    @Test
    public void testGetLocalNumber()
    {
        MainClass main = new MainClass();

        int result = main.getLocalNumber();
        int expectedLocalValue = 14;
        Assert.assertEquals("Метод возвращает не " + expectedLocalValue, expectedLocalValue, result);
    }

    @Test
    public void testGetClassNumber()
    {
        MainClass main = new MainClass();

        int result = main.getClassNumber();
        int expectedClassValue = 45;
        Assert.assertTrue("Метод возвращает число меньше 45", result > expectedClassValue);
    }

    @Test
    public void testGetClassString()
    {
        MainClass main = new MainClass();

        String result = main.getClassString();
        String expectedSubstring = "hello";
        String expectedSubstring2 = "Hello";
        Assert.assertTrue("Метод не возвращает ни подстроку " + expectedSubstring + ", ни подстроку " + expectedSubstring2,
                result.contains(expectedSubstring) || result.contains(expectedSubstring2));
    }
}
