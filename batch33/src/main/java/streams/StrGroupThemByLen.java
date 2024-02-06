package streams;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.stream.Collectors;

public class StrGroupThemByLen {
    public static Map<Integer, List<String>> strGroupThemByLen(List<String> li){
        return li.stream()
                .collect(Collectors.groupingBy(String::length));
    }
  /*  public static void main(String[] args){
        List<String> li = List.of("Hi","Hello","How","Are","You");
        Map<Integer, List<String>> li1 = StrGroupThemByLen.strGroupThemByLen(li);
        System.out.println(li1);
    }*/
}
