package strings;
import java.util.*;

public class Anagram {
    public static boolean areAnagrams(String str1, String str2) {
            // Remove spaces and convert to lowercase
            str1 = str1.replace(" ", "").toLowerCase();
            str2 = str2.replace(" ", "").toLowerCase();

            // Convert strings to character arrays
            char[] charArray1 = str1.toCharArray();
            char[] charArray2 = str2.toCharArray();

            // Sort the character arrays
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            // Compare the sorted arrays
            return Arrays.equals(charArray1, charArray2);
        }

        public static void main(String[] args) {
            String string1 = "Listen";
            String string2 = "Silent";

            if (areAnagrams(string1, string2)) {
                System.out.println(string1 + " and " + string2 + " are anagrams.");
            } else {
                System.out.println(string1 + " and " + string2 + " are not anagrams.");
            }
        }
    }

