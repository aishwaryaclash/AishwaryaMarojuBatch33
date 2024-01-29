package arraylists;


import java.util.HashMap;
import java.util.Map;
import java.util.*;

import java.util.HashMap;
import java.util.Map;
import java.lang.*;


public class PrintDistinctChar {
    public static Map<Character, Integer> countDistinctCharacters(String input) {
        Map<Character, Integer> charCountMap = new HashMap<>();


        input = input.toLowerCase();


        for (char c : input.toCharArray()) {

            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);

        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()){
            char key = entry.getKey();
            int value = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + value);
        }
        return charCountMap;
    }


}