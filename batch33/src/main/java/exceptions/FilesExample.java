package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FilesExample {
    public static void fileRead(String fileName){
       // String fileName = "D:\\BLACK.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
