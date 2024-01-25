package arraylists;
import java.util.ArrayList;
public class RemoveLastElement {

        public static void main(String[] args) {
            // Creating an ArrayList with some elements
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add("Element 1");
            arrayList.add("Element 2");
            arrayList.add("Element 3");

            // Displaying the ArrayList before removal
            System.out.println("ArrayList before removal:");
            ArrayList<String> removedList=processArrayList(arrayList);
            for (String element : removedList) {
                System.out.println(element);
            }
        }
            public static ArrayList<String> processArrayList(ArrayList<String> arrayList) {
                if (!arrayList.isEmpty()) {
                    arrayList.remove(arrayList.size() - 1);
                    System.out.println("\nRemoved the last element.");
                    return arrayList;
                } else {
                    System.out.println("\nArrayList is already empty. No element to remove.");
                   return arrayList;
                }
            }



        }
