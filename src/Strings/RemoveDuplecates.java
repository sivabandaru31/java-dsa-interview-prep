package Strings;

public class RemoveDuplecates {
    public static void main(String[] args) {
        String str="aaaaabbcdeffffggh";
        int n=str.length();
        int i=1;
        String ans=str.charAt(0)+"";
        while(i<n){
            while(i<n && ans.charAt(ans.length()-1)==str.charAt(i)){
                i++;
            }
            if(i<n){
                ans+=str.charAt(i);
                i++;
            }
        }
        System.out.println(ans);
    }
}
