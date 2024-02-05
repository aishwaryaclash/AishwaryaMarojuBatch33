package coreJavaSummary;

import org.testng.annotations.Test;


import static coreJavaSummary.SwapInt.swapInt;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SwapIntTest {
    @Test
    public void swap(){
        int n1=3;
        int n2=4;
        int[] s = swapInt(n1,n2);
        assertTrue(n1==s[1] && n2==s[0]);

    }
}
