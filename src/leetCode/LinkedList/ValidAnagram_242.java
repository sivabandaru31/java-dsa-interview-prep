package leetCode.LinkedList;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram_242 {
    public static boolean anagrem(String s,String t){
        int slength=s.length();
        int tlength=t.length();
        if(slength!=tlength){
            return false;
        }
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sc=s.charAt(i);
            char tc=t.charAt(i);

            map.put(sc,map.getOrDefault(sc,0)+1);
            map.put(tc,map.getOrDefault(tc,0)-1);
        }
        for(int value: map.values()){
            if(value!=0){
                return false;
            }
        }
        return  true;

    }
    public static void main(String[] args) {
        String s = "anagram";
        String t = "anagram";
        boolean result = anagrem(s, t);
        System.out.println(result);
    }
}
