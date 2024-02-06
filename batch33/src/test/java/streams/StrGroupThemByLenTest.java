package streams;

import org.testng.annotations.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;

public class StrGroupThemByLenTest {
    @Test
    public void testGroupThemByLen(){
        List<String> li = List.of("Hi","Hello","How","Are","You");
        Map<Integer, List<String>> li1 = new HashMap<>();
        insertData(li1, 2, "Hi");
        insertData(li1, 3, "How");
        insertData(li1, 3, "Are");
        insertData(li1, 3, "You");
        insertData(li1, 5, "Hello");
        assertEquals(li1,StrGroupThemByLen.strGroupThemByLen(li));
    }

    public static void insertData(Map<Integer, List<String>> map, int key, String value) {
        if (!map.containsKey(key)) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }
}
