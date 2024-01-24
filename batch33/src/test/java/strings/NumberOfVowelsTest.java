package strings;
import strings.NumberOfVowels;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberOfVowelsTest {

    @Test
    public void testCountVowels() {
        // Test case 1: String with all vowels
        String str1 = "aeiou";
        assertEquals(5, NumberOfVowels.countVowels(str1));
    }

        // Test case 2: String with mixed characters
    @Test
    public void testCountVowels1() {
        String str2 = "Hello World";
        assertEquals(3, NumberOfVowels.countVowels(str2));
    }

        // Test case 3: Empty string
    @Test
    public void testCountVowels2() {
        String str3 = "";
        assertEquals(0, NumberOfVowels.countVowels(str3));
    }
    @Test
    public void testCountVowels3() {

        String str4 = null;
        assertEquals(0, NumberOfVowels.countVowels(str4));
    }
        // Test case 5: String with no vowels
        @Test
        public void testCountVowels4() {
            String str5 = "xyz123";
            assertEquals(0, NumberOfVowels.countVowels(str5));
        }
        // Add more test cases as needed
}
