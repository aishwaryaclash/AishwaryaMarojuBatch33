package exceptions;
import exceptions.FilesExampleTest;
import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FilesExampleTest {

    @Test
    public void testFileReading1() {
        String input = "D:/BLACK.txt";
        String expectedContent = "This is a test file.";
        try (PrintWriter writer = new PrintWriter(new FileWriter(input))) {
            writer.println(expectedContent);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Create an instance of FilesExample and call the method to read the file
        FilesExample filesExample = new FilesExample();
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        FilesExample.fileRead(input);

        // Verify if the output matches the expected content
        assertEquals(expectedContent, outputStream.toString().trim());


    }
}
