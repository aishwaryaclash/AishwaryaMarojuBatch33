package arraylists;
import java.util.ArrayList;
public class RemoveLastObject {

        public static void main(String[] args) {
            // Create an ArrayList of Strings
            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("Apple");
            stringList.add("Banana");
            stringList.add("Orange");
            stringList.add("Grapes");

            // Display the original list
            System.out.println("Original ArrayList:");
            System.out.println(stringList);

            // Remove the last object from the ArrayList
            removeLastObject(stringList);

            // Display the modified list after removal
            System.out.println("\nArrayList after removing the last object:");
            System.out.println(stringList);
        }

        public static void removeLastObject(ArrayList<String> list) {
            // Check if the list is not empty before removing
            if (!list.isEmpty()) {
                // Remove the last object using the remove method
                list.remove(list.size() - 1);
            } else {
                System.out.println("ArrayList is empty. Cannot remove the last object.");
            }
        }
    }


