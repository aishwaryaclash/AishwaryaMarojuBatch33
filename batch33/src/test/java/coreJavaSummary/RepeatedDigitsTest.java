package coreJavaSummary;

import org.testng.annotations.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class RepeatedDigitsTest {
    @Test
    public void testRepeatedDigits(){
        HashMap<Integer,Integer> h1=new HashMap<>();
        h1.put(0,1);
        h1.put(1,1);
        h1.put(2,1);
        h1.put(3,1);
        h1.put(4,1);
        h1.put(5,1);
        h1.put(6,1);
        h1.put(7,1);
        h1.put(8,1);
        h1.put(9,1);

        assertEquals(h1,RepeatedDigits.repeatedDigits(1234567890));
    }

}
