package coreJavaSummary;

public class Factorial {
    public static int factorial(int number){
        int result = 1;
        while(number>=1){
            result = result*number;
            number = number-1;
        }
        return result;
    }
}
