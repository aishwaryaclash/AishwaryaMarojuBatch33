package loopsandconditions;
import java.util.*;
public class ReversingNumber {
    static int reverseNumber(int n)
    {
        int rnumber= 0;
        while (n != 0) {
            int digit = n % 10;
            rnumber = rnumber * 10 + digit;
            n /= 10;
        }
        return rnumber;
    }
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);

        // Input the number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Reverse the number
        int reversedNumber = reverseNumber(number);

        // Display the reversed number
        System.out.println("Reversed number: " + reversedNumber);
    }
}
