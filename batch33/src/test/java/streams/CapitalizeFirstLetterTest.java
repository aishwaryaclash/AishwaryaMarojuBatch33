package streams;

import org.testng.Assert;
import org.testng.annotations.Test;
import streams.CapitalizeFirstLetter;

import static org.testng.Assert.assertEquals;
public class CapitalizeFirstLetterTest {
    @Test
    public void testCapitalizeFirstLetter(){
        String[] s = new String[]{"apple","banana","kiwi","cherry"};
        String[] s1 = new String[]{"Apple","Banana","Cherry","Kiwi"};
        Assert.assertEquals(s1, CapitalizeFirstLetter.capitalizeFirstLetter(s));
    }
}
