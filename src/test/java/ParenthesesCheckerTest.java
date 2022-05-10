import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ParenthesesCheckerTest {
    private String goodCode = "(* 2 (cos 0) (+ 4 6))";
    private String badCode = "(* 2 (cos 0) (+ 4 6)";
    private ParenthesesChecker systemUnderTest = new ParenthesesChecker();

    @Test
    public void happy_Path(){
        Boolean test = systemUnderTest.validateCode(goodCode);
        Assert.assertTrue(test);
    }

    @Test
    public void sad_Path(){
        Boolean test = systemUnderTest.validateCode(badCode);
        Assert.assertFalse(test);
    }
}
