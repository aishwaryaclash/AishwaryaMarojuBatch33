package coreJavaSummary;

import org.testng.annotations.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;

public class UniqueWordsTest {
    @Test
    public void testUniqueWordsTest(){
        HashMap<String,Integer> h1=new HashMap<String,Integer>();
        h1.put("Hi",1);
        h1.put("Hello",1);
        h1.put("World",1);
        assertEquals(h1,UniqueWords.uniqueWords("Hi Hello World"));
    }
}
