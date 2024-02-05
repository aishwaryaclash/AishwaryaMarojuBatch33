package coreJavaSummary;

public class SwapInt {
    public static int[] swapInt(int n1, int n2){
        int t1=n1, t2=n2;
        n1 = n1+n2;
        n2 = n1-n2;
        n1 = n1-n2;
        int[] values = {n1,n2};
        return values;
    }
}
