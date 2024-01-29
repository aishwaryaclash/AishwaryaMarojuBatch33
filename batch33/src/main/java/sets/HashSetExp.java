package sets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExp {


    public static ArrayList<String> getNextElementUsingIterator(HashSet<String> set) {
        ArrayList<String> set2 = new ArrayList<>();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            set2.add(iterator.next());
        }
        return set2;
    }

    public static ArrayList<String> getElementUsingForLoop(HashSet<String> set) {
        ArrayList<String> alp = new ArrayList<>();
        String[] p= new String[set.size()];
        set.toArray(p);

        for (int i = 0; i < p.length; i++) {
            alp.add(p[i]);
        }
        return alp;
    }

    public static ArrayList<String> getElementUsingEnhancedForLoop(HashSet<String> set) {

        ArrayList<String> al = new ArrayList<>();
        for (String p : set) {
            al.add(p);
        }
        return al;
    }
}
