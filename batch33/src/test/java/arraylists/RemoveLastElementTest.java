package arraylists;
import arraylists.RemoveLastElement;
import com.beust.ah.A;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;

import static junit.framework.Assert.*;
public class RemoveLastElementTest {
    @Test
    //if last element is empty
    void testRemoveLastElement1()
    {
        System.out.println("Test Case 1 :");
       ArrayList<String> stringList=new ArrayList<>();
       stringList.add("");
       System.out.println("ArrayList before removal: "+stringList);
       //Removing the last object
        ArrayList<String> expectedList=new ArrayList<>();
        expectedList.add("");
        System.out.println("Expected ArrayList after removal: " + expectedList);
        Assert.assertEquals(expectedList,RemoveLastElement.processArrayList(stringList));


    }
    @Test
    //if last element is some value including null
    void testRemoveLastElement2()
    {
        System.out.println("Test Case 2 :");
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Display the ArrayList before removal (optional)
        System.out.println("ArrayList before removal: " + stringList);

        // Remove the last object


        // Expected ArrayList after removal
        ArrayList<String> expectedList = new ArrayList<>();
        expectedList.add("Apple");
        expectedList.add("Banana");
        expectedList.add("Orange");

        // Display the ArrayList after removal (optional)
        System.out.println("Expected ArrayList after removal: " + expectedList);

        // Check if the actual ArrayList matches the expected ArrayList
       Assert.assertEquals(expectedList,RemoveLastElement.processArrayList(stringList));
    }


    }

