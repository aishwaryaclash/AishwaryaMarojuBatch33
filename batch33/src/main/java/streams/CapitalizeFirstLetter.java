package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class CapitalizeFirstLetter {

    public static String[] capitalizeFirstLetter(String[] s){

        if(s == null){
            return s;
        }
        String[] capitalizedArray = Arrays.stream(s)
                .map(a -> a.substring(0,1).toUpperCase()+a.substring(1))
                .toArray(String[]::new);
        String[] capitalizedArray1 = Arrays.stream(capitalizedArray)
                .sorted(Comparator.naturalOrder()).toArray(String[]::new);
        return capitalizedArray1;

    }


}
