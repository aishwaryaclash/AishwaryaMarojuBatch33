package lambdastreams;
import lambdastreams.GroupByLengthOfStrings;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class GroupByLengthOfStringsTest {
    @Test
    public void testGroupByLength() {
        // Arrange
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "grape", "kiwi"));

        // Act
        Map<Integer, List<String>> result = GroupByLengthOfStrings.groupByLength(inputList);
        System.out.println(result);


        // Assert
        assertEquals(1, result.get(4).size()); // "kiwi", "grape"
        assertEquals(2, result.get(5).size()); // "apple"
        assertEquals(2, result.get(6).size()); // "banana", "orange"
    }

    @Test
    //test case for empty list
    public void testGroupByLength2() {
        // Arrange
        ArrayList<String> inputList = new ArrayList<>(Arrays.asList(""));

        // Act
        Map<Integer, List<String>> result = GroupByLengthOfStrings.groupByLength(inputList);

        if(result.isEmpty())
        {
            System.out.println("aishu");
        }
        assertEquals(1,result.get(0).size());


    }

}
