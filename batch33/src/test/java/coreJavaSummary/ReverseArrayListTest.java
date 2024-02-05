package coreJavaSummary;

import com.beust.ah.A;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ReverseArrayListTest {
    @Test
    public void testReverseArrayList(){
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        b.add(3);
        b.add(2);
        b.add(1);
        assertEquals(b,ReverseArrayList.reverseArrayList(a));
    }
}
