package coreJavaSummary;

import java.util.ArrayList;


public class ReverseArrayList {
    public static ArrayList<Integer> reverseArrayList(ArrayList<Integer> arrayList){
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        int temp;
        for(int i=arrayList.size()-1;i>=0;i--){
            temp=arrayList.get(i);
            arrayList1.add(temp);
        }
        /*for (Integer e:arrayList1) {
            System.out.println(e);
        }*/

        return arrayList1;
    }

    /*public static void main(String[] args){
        ReverseArrayList r=new ReverseArrayList();
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        r.reverseArrayList(a);

    }*/
}
