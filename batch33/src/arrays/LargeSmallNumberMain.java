package arrays;
import java.util.*;
public class LargeSmallNumberMain extends LargestAndSmallest{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        System.out.println("Enter the numbers into the array");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The largest Number from the array is : "+LargestAndSmallest.largest(arr));
        System.out.println("The Smallest Number from the array is : "+LargestAndSmallest.smallest(arr));
    }
}
