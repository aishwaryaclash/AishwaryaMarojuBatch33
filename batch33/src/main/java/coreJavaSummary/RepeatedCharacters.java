package coreJavaSummary;

import java.util.HashMap;
import java.util.HashSet;

public class RepeatedCharacters {
    public static HashMap<Character,Integer> repeatedCharacters(String s){
        HashMap<Character,Integer> h = new HashMap<>();
        s.toLowerCase();
        char[] s1=s.toCharArray();
        for(int i=0; i<s.length();i++){
            int count=0;
            for(int j=0; j<s.length();j++){
                if(s1[i]==s1[j])
                    count++;
            }
            if(count>=2) {
                h.put(s1[i], count);
            }
        }
        return h;
    }
}
