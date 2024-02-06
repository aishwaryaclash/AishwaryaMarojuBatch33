package streams;

import org.testng.annotations.Test;
import streams.AverageOfSquaresOfOddNumbers;

import static org.junit.Assert.assertEquals;


public class AverageOfSquaresOfOddNumbersTest {
    @Test
    public void testAverageOfSquaresOfOddNumbers(){
            int[] array = {1,2,3,4,5};
            assertEquals((int)5.0,(int) AverageOfSquaresOfOddNumbers.averageOfSquaresOfOddNumbers(array));
    }
}
