package sets;
import sets.HashSetExp;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashSetExpTest {

    @Test
    public void HashSetTraverseTest1() {
        HashSet<String> set1 = new HashSet<>();
        set1.add("Aishwarya");
        set1.add("snist");
        set1.add("unt");
        set1.add("Aishwarya");
        set1.add("snist");
        set1.add("unt");
        set1.add("Aishwarya");
        set1.add("snist");
        set1.add("unt");
        set1.add("Aishwarya");
        ArrayList<String> arrayList = new ArrayList<>(set1);
        assertEquals(arrayList, HashSetExp.getNextElementUsingIterator(set1));
        assertEquals(arrayList, HashSetExp.getElementUsingForLoop(set1));
        assertEquals(arrayList, HashSetExp.getElementUsingEnhancedForLoop(set1));

    }
}


