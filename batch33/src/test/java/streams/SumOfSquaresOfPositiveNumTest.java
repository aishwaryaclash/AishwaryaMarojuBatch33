package streams;

import org.testng.annotations.Test;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class SumOfSquaresOfPositiveNumTest {
    @Test
    public void testSumOfSquareOfPositiveNum(){
        List<Integer> li = List.of(1,2,3);
        Double sum = 14.0;
        assertEquals(sum ,SumOfSquaresOfPositiveNum.sumOfSquaresOfPositive(li));
    }
}
