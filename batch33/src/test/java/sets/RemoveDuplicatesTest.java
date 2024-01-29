package sets;
import java.lang.*;
import java.util.*;
import sets.RemoveDuplicates;
import org.testng.annotations.Test;

import static org.junit.Assert.assertEquals;

public class RemoveDuplicatesTest {
    @Test
    public void RemoveDuplicate1()
    {
        String p="Aishwarya";
        String expectedString="Aishwary";
        assertEquals(expectedString,RemoveDuplicates.removeDuplicates(p));


    }
    @Test
    public void RemoveDuplicate2()
    {
        String p=null;
        String expectedString=p;
        assertEquals(expectedString,RemoveDuplicates.removeDuplicates(p));
    }
    @Test
    public void RemoveDuplicate3()
    {
        String p2="";
        String expectedStrings=p2;
        assertEquals(expectedStrings,RemoveDuplicates.removeDuplicates(p2));

    }
}
