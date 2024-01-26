package arraylists;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

import java.util.HashMap;
import java.util.Map;

public class PrintDistinctChar {
    public static Map<Character, Integer> countDistinctCharacters(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();


        input = input.toLowerCase();


        for (char c : input.toCharArray()) {

            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        return charCountMap;
    }


}