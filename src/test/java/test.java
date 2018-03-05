import org.junit.Assert;
import org.junit.Test;
public class test {
    @Test
    public void firstTest() {
        Assert.assertTrue(main.prime(2));
        Assert.assertTrue(main.prime(3));
        Assert.assertTrue(main.prime(5));
        Assert.assertTrue(main.prime(7));
        Assert.assertTrue(main.prime(11));
        Assert.assertTrue(main.prime(9494411));
        Assert.assertTrue(main.prime(13));
        Assert.assertTrue(main.prime(17));
        Assert.assertTrue(main.prime(19));
        Assert.assertTrue(main.prime(23));
        Assert.assertTrue(main.prime(29));
        Assert.assertTrue(main.prime(31));
        Assert.assertTrue(main.prime(37));
        Assert.assertTrue(main.prime(41));
        Assert.assertTrue(main.prime(43));
        Assert.assertTrue(main.prime(47));
   }
}
