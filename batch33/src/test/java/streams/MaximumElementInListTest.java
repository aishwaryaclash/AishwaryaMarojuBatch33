package streams;

import org.testng.annotations.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MaximumElementInListTest {
    @Test
    public void testMaximumElementInList(){
        List<Integer> li = List.of(1,2,3,10,9,2,82,199,180);
        List<Integer> li1 = List.of(199);
        assertEquals(li1, MaximumElementInList.maximumElementInList(li));
    }
}
