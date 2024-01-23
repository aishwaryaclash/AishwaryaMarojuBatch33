package org.example;



import org.testng.annotations.Test;
import strings.Anagram;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AnagramTest {

    @Test
    void testAreAnagrams() {

        assertTrue(Anagram.areAnagrams("listen", "silent"));
    }
    @Test
    void testAreAnagrams1() {
        assertTrue(Anagram.areAnagrams("Listen", "Silent"));
    }

    @Test
    void testAreAnagrams2() {
        assertFalse(Anagram.areAnagrams("hello", "world"));
    }

    @Test
    void testAreAnagrams3() {
        assertTrue(Anagram.areAnagrams("dormitory", "dirty room"));
    }

    @Test
    void testAreAnagrams4() {
        assertTrue(Anagram.areAnagrams("schoolmaster", "the classroom"));
    }

    @Test
    void testAreAnagrams5() {
        assertTrue(Anagram.areAnagrams("123", "321"));
    }
}