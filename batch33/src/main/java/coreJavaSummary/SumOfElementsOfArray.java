package coreJavaSummary;

public class SumOfElementsOfArray {
    public static int sumOfElementsOfArray(Integer[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum = sum+array[i];
        }
        return sum;
    }
}
