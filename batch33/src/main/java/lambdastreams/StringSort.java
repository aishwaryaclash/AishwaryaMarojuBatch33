package lambdastreams;

import java.util.Arrays;
import java.util.Comparator;

public class StringSort {
    public static String[] sortStrings(String[] p) {
        String[] sortedArray = Arrays.stream(p)
                .sorted(Comparator.comparingInt(String::length)
                        .thenComparing(Comparator.comparing(String::length).reversed())
                        .thenComparing(Comparator.comparing(String::valueOf).reversed()))
                .toArray(String[]::new);

        // Printing the sorted array
        return sortedArray;
    }
}
