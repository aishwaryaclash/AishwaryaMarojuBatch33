package strings;

import java.util.Scanner;

public class NumberOfVowels {

    public static int countVowels(String str) {
        if (str == null || str.isEmpty()) {
            return 0; // Return 0 for null or empty string
        }

        int count = 0;
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
                    || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.next();

        int vowelsCount = countVowels(inputString);

        System.out.println("Number of Vowels in the String are: " + vowelsCount);
    }
}
