package streams;

import org.testng.annotations.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesFromListTest {
    @Test
    public static void testRemoveDuplicatesFromListTest(){
        List<Integer> li = List.of(1,2,3,2,1,3,4,5,4,3,2);
        List<Integer> li1 = List.of(1,2,3,4,5);
        assertEquals(li1,RemoveDuplicatesFromList.removeDuplicatesFromList(li));
    }
}
