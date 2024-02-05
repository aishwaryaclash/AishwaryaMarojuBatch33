package lambdastreams;

import java.util.Arrays;

public class AverageOfSquaresOfOdds {
    public static double findAverage(int[] nums)
    {
        return Arrays.stream(nums).filter(s ->s%2!=0).map(s ->s*s).average().orElse(0.0d);
    }
}
