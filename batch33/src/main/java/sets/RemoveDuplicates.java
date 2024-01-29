package sets;

import java.util.HashSet;

public class RemoveDuplicates {


    public static String removeDuplicates(String input) {
        // Check for null or empty string
        if (input == null || input.isEmpty()) {
            return input;
        }

        HashSet<Character> charSet = new HashSet<>();
        StringBuilder resultBuilder = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (charSet.add(c)) {
                // Character is not present in the set, add it to the result
                resultBuilder.append(c);
            }
        }

        return resultBuilder.toString();
    }
}
