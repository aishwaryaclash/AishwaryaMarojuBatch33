package lambdastreams;

import org.junit.Test;
import lambdastreams.CaptializefirstLetter;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CapitalizeSort {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Test
    public void testCapitalizeAndSort() {
        String[] stringArray = {"apple", "banana", "kiwi", "grape"};

        // Run the main program logic and capture the result

        List<String> result = CaptializefirstLetter.capitalizeAndSort(stringArray);

        // Expected output for non-empty and non-null strings
        List<String> expectedOutput = List.of("Apple", "Banana", "Grape","Kiwi");
       System.out.println(expectedOutput);
       System.out.println(result);
        // Trim both expected and actual output before assertion
        assertEquals(expectedOutput, result);
    }

    @Test
    public void testCapitalizeAndSort2() {
        // Expected output for empty or null strings
        String expectedEmptyOrNullOutput = "Cannot capitalize and sort as string is empty or null\n";


        // Redirect System.out for testing
        System.setOut(new PrintStream(outContent));
        String[] p2={null};
        // Run the main program logic again to capture the print messages
        CaptializefirstLetter.capitalizeAndSort(p2);

        // Reset System.out
        System.setOut(originalOut);

        // Trim both expected and actual output before assertion
        assertEquals(expectedEmptyOrNullOutput.trim(), outContent.toString().trim());
    }
    @Test
    public void testCapitalizeAndSort3() {
        // Expected output for empty or null strings
        String expectedEmptyOrNullOutput = "Cannot capitalize and sort as string is empty or null\n" ;

        // Redirect System.out for testing
        System.setOut(new PrintStream(outContent));
       String[] tring3={""};
        // Run the main program logic again to capture the print messages
        CaptializefirstLetter.capitalizeAndSort(tring3);

        // Reset System.out
        System.setOut(originalOut);

        // Trim both expected and actual output before assertion
        assertEquals(expectedEmptyOrNullOutput.trim(), outContent.toString().trim());
    }
}
