package arraylists;
import arraylists.TraversalOfList;
import org.testng.annotations.Test;

import static junit.framework.Assert.*;


public class TraversalTest {

    @Test
    void testTraverseArrayList1() {
        System.out.println("Test Case 1:");
        assertEquals(false,TraversalOfList.traverseArrayList(""));
    }
      @Test
      void testTraverseArrayList2() {
          // Test Case 2: Null string
          System.out.println("\nTest Case 2:");
         assertEquals(false,TraversalOfList.traverseArrayList(null));
      }
      @Test
              void testTraverseArrayList3(){
            // Test Case 3: Some String value
            System.out.println("\nTest Case 3:");
            assertEquals(true,TraversalOfList.traverseArrayList("Ayodhya"));

            // Add more test cases as needed
        }
    }


