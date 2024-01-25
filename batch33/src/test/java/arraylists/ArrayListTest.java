package arraylists;
import arraylists.ArrayListToArray;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.assertArrayEquals;

public class ArrayListTest {

    @Test
    public void testArrayListToArrayConversion1() {
        // Create an ArrayList of Strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("Python");
        arrayList.add("JavaScript");
        arrayList.add(null);

        // Convert ArrayList to array
        String[] expectedArray = {"Java", "Python", "JavaScript",null};
        String[] actualArray = ArrayListToArray.convertArrayListToArray(arrayList);

        // Check if the arrays are equal
        assertArrayEquals(expectedArray, actualArray);
    }
    @Test
    //if array list is empty
    public void testArrayListToArrayConversion2()
    {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("");
        String[] expectedArray={};
        String[] actualArray=ArrayListToArray.convertArrayListToArray(arrayList);
    }

}

