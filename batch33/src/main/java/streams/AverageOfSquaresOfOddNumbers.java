package streams;

import java.util.Arrays;

public class AverageOfSquaresOfOddNumbers {
    public static double averageOfSquaresOfOddNumbers(int[] array){
        double average = Arrays.stream(array)
                .filter(n -> n % 2 != 0)
                .mapToDouble(n -> Math.pow(n, 2))
                .average()
                .orElse(0);
        return average;
    }
    /*public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9};
        SumOfSquaresOfOddNumbers.averageOfSquaresOfOddNumbers(array);
    }*/
}
