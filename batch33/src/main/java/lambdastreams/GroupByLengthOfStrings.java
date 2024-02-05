package lambdastreams;
import java.util.*;
import java.util.stream.Collectors;

public class GroupByLengthOfStrings {

    public static Map<Integer, List<String>> groupByLength(ArrayList<String> al) {
        if (al == null || al.isEmpty()) {
            System.out.println("Input list is either null or empty.");
            return Collections.emptyMap(); // Return an empty map or handle it as needed
        }

        Map<Integer, List<String>> groupedByLength = al.stream()
                .collect(Collectors.groupingBy(String::length));

        groupedByLength.forEach((length, strings) ->
                System.out.println("Strings with length " + length + ": " + strings));

        return groupedByLength;
    }
}