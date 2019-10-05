import org.junit.Assert;
import org.junit.Test;

public class MyStringUtilsTest {
    @Test
    public void reverseTest() {
        Assert.assertEquals("DRZ400", MyStringUtils.reverse("004ZRD"));
        Assert.assertEquals("retupmoc", MyStringUtils.reverse("computer"));
        Assert.assertEquals("tnemngissa", MyStringUtils.reverse("assignment"));
        Assert.assertEquals("nomekop", MyStringUtils.reverse("pokemon"));
        Assert.assertNotEquals("Josh", MyStringUtils.reverse("pokemon"));
    }

    @Test
    public void isPalindromeTest() {
        Assert.assertTrue(MyStringUtils.isPalindrome("racecar"));
        Assert.assertTrue(MyStringUtils.isPalindrome("mom"));
        Assert.assertTrue(MyStringUtils.isPalindrome("wow"));
        Assert.assertFalse(MyStringUtils.isPalindrome("radars"));
    }

    @Test
    public void countOfVowelsTest() {
        Assert.assertEquals(2, MyStringUtils.countOfVowels("mirror"));
        Assert.assertEquals(2, MyStringUtils.countOfVowels("Rotor"));
        Assert.assertEquals(3, MyStringUtils.countOfVowels("joshua"));
        Assert.assertEquals(4, MyStringUtils.countOfVowels("Speedracer"));
        Assert.assertNotEquals(2, MyStringUtils.countOfVowels("William"));
    }

    @Test
    public void oddContainsTest() {
        Assert.assertTrue(MyStringUtils.oddContatins("joshua", "jsu"));
        Assert.assertTrue(MyStringUtils.oddContatins("steam", "sem"));
        Assert.assertFalse(MyStringUtils.oddContatins("corsair", "cors"));
    }
}