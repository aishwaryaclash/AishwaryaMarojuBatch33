package lambdastreams;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class RemoveDuplicates {
    public static ArrayList<Integer> RemoveDuplicates1(ArrayList<Integer> al){
        ArrayList<Integer> p=new ArrayList<>(al.stream().distinct().collect(Collectors.toList()));
        return p;


    }
}
