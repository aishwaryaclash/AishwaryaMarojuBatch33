package coreJavaSummary;

public class Palindrome {
    public static boolean isPalindrome(int number){
        int updatedNumber=0;
        int number1 = number;
        int temp;
        while(number>0){
            temp = number%10;
            updatedNumber = updatedNumber*10 + temp;
            number = number/10;
        }

        if(number1 == updatedNumber){
            return true;
        }
        else{
            return false;
        }

    }
}
