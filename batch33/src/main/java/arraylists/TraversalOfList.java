package arraylists;
import java.util.ArrayList;



public class TraversalOfList {
    public static boolean traverseArrayList(String s) {
        // Handling null and empty strings
        if (s == null || s.isEmpty()) {
            System.out.println("Input string is null or empty. Exiting traversal.");
            return false;
        }

        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        stringList.add("Java");
        stringList.add("Programming");
        stringList.add(s);

        // Traversing using a regular for loop
        System.out.println("Traversing using a regular for loop:");
        for (int i = 0; i < stringList.size(); i++) {
            String element = stringList.get(i);
            System.out.println(element);
        }

        // Traversing using an enhanced for loop
        System.out.println("\nTraversing using an enhanced for loop:");
        for (String element : stringList) {
            System.out.println(element);
        }
        return true;
    }

    public static void main(String args[]) {
        // Test with a non-empty string
        traverseArrayList("Aishwarya");

        // Test with null string
        traverseArrayList(null);

        // Test with empty string
        traverseArrayList("");
    }
}
