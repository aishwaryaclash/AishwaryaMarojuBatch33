package arraylists;
import java.util.ArrayList;
public class RemoveLastElement {

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
