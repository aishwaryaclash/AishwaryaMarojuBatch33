package streams;

import org.testng.annotations.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FilterEvenNumThenDoubleTest {
    @Test
    public void testFilterEvenNumThenDouble(){
        List<Integer> li = List.of(1,2,3,4,5,6);
        List<Integer> li1 = List.of(4,8,12);
        assertEquals(li1,FilterEvenNumThenDouble.filterEvenNumThenDouble(li));
    }
}
