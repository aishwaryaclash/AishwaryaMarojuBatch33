package strings;
import java.util.*;
import java.lang.*;
public class NumberOfVowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String st = sc.next();
        st = st.toLowerCase();
        for (int i = 0; i < st.length(); i++) {
            if (st.charAt(i) == 'a' || st.charAt(i) == 'e'
                    || st.charAt(i) == 'i'
                    || st.charAt(i) == 'o'
                    || st.charAt(i) == 'u') {

                count++;
            }

        }
        System.out.println("Number of Vowels in a String are: " + count);
    }
}