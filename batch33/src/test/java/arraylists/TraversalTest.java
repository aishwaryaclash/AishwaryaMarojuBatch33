package arraylists;
import arraylists.TraversalOfList;
import org.testng.annotations.Test;


import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;


public class TraversalTest {

    @Test
    void testTraverseArrayList1() {
        System.out.println("Test Case 1:");
        assertTrue(TraversalOfList.traverseArrayList(""));
    }
      @Test
              void testTraverseArrayList2() {
          // Test Case 2: Null string
          System.out.println("\nTest Case 2:");
         assertTrue(TraversalOfList.traverseArrayList(null));
      }
      @Test
              void testTraverseArrayList3(){
            // Test Case 3: Empty string
            System.out.println("\nTest Case 3:");
            assertTrue(TraversalOfList.traverseArrayList("Ayodhya"));

            // Add more test cases as needed
        }
    }


