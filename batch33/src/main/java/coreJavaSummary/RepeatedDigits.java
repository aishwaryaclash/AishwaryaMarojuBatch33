package coreJavaSummary;

import java.util.ArrayList;
import java.util.HashMap;

public class RepeatedDigits {
    public static HashMap<Integer,Integer> repeatedDigits(int n){
        ArrayList<Integer> d = new ArrayList<>();
        HashMap<Integer,Integer> h = new HashMap<>();
        int r;
        while(n!=0){
            r=n%10;
            n=n/10;
            d.add(r);
        }
        for(int i=0;i<d.size();i++){
            int count=0;
            for(int j=0;j<d.size();j++){
                if(d.get(i) == d.get(j))
                   count++;
            }
            h.put(d.get(i),count);
        }
        return h;
    }
}
