package ExtendDemo;

import org.testng.annotations.Test;
import org.testng.Assert;
 
public class function2 extends BaseTest
{
    @Test
    public void functionality2Test1()
    {
        test = extent.createTest("functionality2Test1");
        Assert.assertTrue(1 > 0);
    }
     
    @Test
    public void functionality2Test2()
    {
        test = extent.createTest("functionality2Test2");
        Assert.assertEquals("Krishna", "Sakinala");
    }
     
    @Test
    public void functionality2Test3()
    {
        test = extent.createTest("functionality2Test3");
        Assert.assertNotEquals("Krishna", "Krishna");
    }
}
