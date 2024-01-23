package arrays;
import java.util.*;
public class LargestAndSmallest {
   public static int largest(int[] brr){
       int large=brr[0];
       for(int i:brr)
       {
           if(i>large)
           {
               large=i;
           }
       }
       return large;
   }
   public static int smallest(int[] brr)
   {
       int small=brr[0];
       for(int j:brr)
       {
           if(j<small)
           {
               small=j;
           }
       }
       return small;
   }

    }


