package arraylists;

import java.util.ArrayList;

public class ArrayListToArray {




        public static String[] convertArrayListToArray(ArrayList<String> arrayList) {

            if(!arrayList.isEmpty())
            {

                String[] array1=arrayList.toArray(new String[arrayList.size()]);
                return array1;

            }
            else {
                String[] array1=arrayList.toArray(new String[arrayList.size()]);
                return array1;
            }
        }
    }

