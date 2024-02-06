package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.stream.Collectors;

public class ArraysBasedOnCriteria {
    public static String[] sortBasedOnLength(String[] array){
        String[] sortedArray = Arrays.stream(array)
                .sorted(Comparator.comparingInt(String::length))
                .toArray(String[]::new);
        return sortedArray;
        /*for(int i=0; i< sortedArray.length; i++)
            System.out.println(sortedArray[i]);*/
    }
    /*public static void main(String[] args){
        String[] array = {"banana","apple","grapes","cherry","Kiwi","Straw Berry"};
        ArraysBasedOnCriteria.sortBasedOnLength(array);
    }*/
}
