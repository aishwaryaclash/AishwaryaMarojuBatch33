package coreJavaSummary;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class RepeatedCharactersTest {
    @Test
    public void testRepeatedCharacters(){
        HashMap<Character, Integer> h1 = new HashMap();
        h1.put('s',2);
        assertEquals(h1,RepeatedCharacters.repeatedCharacters("strings"));
    }
}
