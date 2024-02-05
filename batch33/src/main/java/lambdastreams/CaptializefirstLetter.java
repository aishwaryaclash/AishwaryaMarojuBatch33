package lambdastreams;
import java.util.*;
import java.util.stream.Collectors;

public class CaptializefirstLetter {
    // Function to capitalize the first letter of each non-empty and non-null string and return in alphabetical order
    static List<String> capitalizeAndSort(String[] strings) {
        List<String> capitalizedAndSorted = Arrays.stream(strings)
                .filter(s -> s != null && !s.isEmpty()) // Filter out null or empty strings
                .map(s -> s.substring(0, 1).toUpperCase() + s.substring(1))
                .sorted()
                .collect(Collectors.toList());

        // Print message for empty or null strings
        Arrays.stream(strings)
                .filter(s -> s == null || s.isEmpty()).forEach(s ->System.out.println("Cannot capitalize and sort as string is empty or null"));

        return capitalizedAndSorted;
    }
}