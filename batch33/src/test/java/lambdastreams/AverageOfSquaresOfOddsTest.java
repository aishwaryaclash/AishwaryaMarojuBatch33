package lambdastreams;
import lambdastreams.AverageOfSquaresOfOdds;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class AverageOfSquaresOfOddsTest {

    @Test
    public void testFindAverage() {
        int[] nums = {1, 2, 3, 4, 5};

        double result = AverageOfSquaresOfOdds.findAverage(nums);

        // Expected output: Average of squares of odd numbers = (1*1 + 3*3 + 5*5) / 3
        double expectedOutput = (1 * 1 + 3 * 3 + 5 * 5) / 3.0;

        // Assert the result equals the expected output with a small delta for floating-point comparison
        assertEquals(expectedOutput, result, 0.0001);
    }

    @Test
    public void testFindAverageWithNoOdds() {
        int[] nums = {2, 4, 6, 8, 10};

        double result = AverageOfSquaresOfOdds.findAverage(nums);

        // Expected output: No odd numbers, so the result should be 0.0
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testFindAverageWithEmptyArray() {
        int[] nums = {};

        double result = AverageOfSquaresOfOdds.findAverage(nums);

        // Expected output: Empty array, so the result should be 0.0
        assertEquals(0.0, result, 0.0001);
    }
}

