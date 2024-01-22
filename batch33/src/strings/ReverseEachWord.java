package strings;

public class ReverseEachWord {

    public static String reverseEachWord(String sentence) {
        // Split the sentence into words
        String[] words = sentence.split(" ");

        // Reverse each word
        for (int i = 0; i < words.length; i++) {
            words[i] = reverseWord(words[i]);
        }

        // Join the reversed words to form the final sentence
        return String.join(" ", words);
    }

    private static String reverseWord(String word) {
        // Convert the word to a character array
        char[] charArray = word.toCharArray();

        // Reverse the character array
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            // Swap characters at start and end positions
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            // Move towards the center
            start++;
            end--;
        }

        // Convert the reversed character array back to a string
        return new String(charArray);
    }

    public static void main(String[] args) {
        String inputSentence = "Java J2EE Reverse Me";
        String reversedSentence = reverseEachWord(inputSentence);

        System.out.println("Input: " + inputSentence);
        System.out.println("Output: " + reversedSentence);
    }
}
