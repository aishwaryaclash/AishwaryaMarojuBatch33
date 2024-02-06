package streams;


import java.util.List;
import java.util.stream.Collectors;


public class FilterEvenNumThenDouble {
    public static List<Integer> filterEvenNumThenDouble(List<Integer> li){
        return li.stream()
                .filter(s -> (s%2 ==0))
                .map(s -> s*2)
                .collect(Collectors.toList());
    }
}
