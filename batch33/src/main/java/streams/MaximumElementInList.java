package streams;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;

public class MaximumElementInList {
    public static List<Integer> maximumElementInList(List<Integer> li){
        return li.stream()
                .max(Integer::compareTo)
                .stream().collect(Collectors.toList());
    }

    /*public static void main(String[] args){
        List<Integer> li = List.of(1,2,1000);
        System.out.println(MaximumElementInList.maximumElementInList(li));
    }*/
}
