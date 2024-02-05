package lambdastreams;
import lambdastreams.RemoveDuplicates;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicateTest {
    @Test
    public void testDuplicates1()
    {
        ArrayList<Integer> input=new ArrayList<>(Arrays.asList(1,2,344,6,5,3,1,2,2,2,3,1,5,6,7,8,1,1,1,1,1,1,1,1));
        ArrayList<Integer> actual_output=RemoveDuplicates.RemoveDuplicates1(input);
        ArrayList<Integer> expected_list=new ArrayList<>(Arrays.asList(1,2,344,6,5,3,7,8));
        System.out.println(expected_list);
        assertEquals(expected_list,actual_output);
    }

}
