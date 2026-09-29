package HashMap;

import java.util.Arrays;
import java.util.HashMap;

public class TextCompression {
    public static void main(String[] args) {
        String str="aaabbccccdddd";

        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
           // hm.put(ch,h.)
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            //hm.put(ch,1);
        }
        //System.out.println(hm.keySet());
        //System.out.println(hm);
        StringBuilder sb=new StringBuilder();
        for( Character ch: hm.keySet()){
            sb.append(ch);
            sb.append(hm.get(ch));
        }
        System.out.println(sb.toString());

    }
}
