package lambdastreams;

import lambdastreams.StringSort;

import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertArrayEquals;

public class StringSortTest {

    @Test
    public void testStringArraySort() {
        String[] stringArray = {"apple", "banana", "orange", "grape", "kiwi"};
        String[] expectedSortedArray = {"kiwi", "grape","apple","orange","banana"};

        // Create an instance of StringArraySort
        StringSort stringArraySort = new StringSort();

        // Call the method to sort the array
        String[] sortedArray = StringSort.sortStrings(stringArray);

        // Compare the sorted array with the expected result
        assertArrayEquals(expectedSortedArray, sortedArray);
    }
}