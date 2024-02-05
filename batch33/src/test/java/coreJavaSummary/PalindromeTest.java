package coreJavaSummary;


import org.testng.annotations.Test;


import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    @Test
    public void checkPalindrome(){
        assertTrue(Palindrome.isPalindrome(12321));
        assertFalse(Palindrome.isPalindrome(12345));
    }



}
