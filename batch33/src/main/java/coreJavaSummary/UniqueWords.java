package coreJavaSummary;

import java.util.HashMap;

public class UniqueWords {
    public static HashMap<String,Integer> uniqueWords(String s){
        HashMap<String,Integer> h=new HashMap<>();
        String[] w = s.split(" ");
        for(int i=0; i<w.length; i++){
            int count=0;
            for(int j=0; j<w.length;j++){
                if(w[i]==w[j])
                    count++;
            }
            if(count==1)
                h.put(w[i],count);

        }
        return h;
    }
}
