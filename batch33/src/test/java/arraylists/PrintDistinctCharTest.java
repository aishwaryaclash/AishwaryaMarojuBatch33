package arraylists;
import arraylists.PrintDistinctChar;
import org.junit.Test;

import java.util.Map;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PrintDistinctCharTest {
    @Test
    public void testCountDistinctCharacters() {

        String inputString = "test string";

        Map<Character, Integer> charCountMap = PrintDistinctChar.countDistinctCharacters(inputString);

        assertEquals(3, charCountMap.get('t'), "Character 't' should appear 3 times");
        assertEquals(1, charCountMap.get('e'), "Character 'e' should appear 1 time");
        assertEquals(2, charCountMap.get('s'), "Character 's' should appear 2 times");
        assertEquals(1, charCountMap.get('r'), "Character 'r' should appear 1 time");
        assertEquals(1, charCountMap.get('i'), "Character 'i' should appear 1 time");
        assertEquals(1, charCountMap.get('n'), "Character 'n' should appear 1 time");
        assertEquals(1, charCountMap.get('g'), "Character 'g' should appear 1 time");
    }

    @Test
    public void testCountDistinctCharactersWithEmptyString1() {

        String inputString = "";
        Map<Character, Integer> charCountMap = PrintDistinctChar.countDistinctCharacters(inputString);

        assertTrue(charCountMap.isEmpty(), "Map should be empty for an empty string");
    }
}