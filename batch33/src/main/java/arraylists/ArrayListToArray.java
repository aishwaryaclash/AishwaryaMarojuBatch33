package arraylists;

import java.util.ArrayList;

public class ArrayListToArray {
        public static void main(String[] args) {

            ArrayList<String> stringList = new ArrayList<>();
            stringList.add("Apple");
            stringList.add("Banana");
            stringList.add("Orange");
            stringList.add("Grapes");


            String[] stringArray = convertArrayListToArray(stringList);


            System.out.println("Elements in the Array:");
            for (String element : stringArray) {
                System.out.println(element);
            }
        }


        public static String[] convertArrayListToArray(ArrayList<String> arrayList) {
            String[] array = new String[arrayList.size()];
            arrayList.toArray(array);
            return array;
        }
    }

