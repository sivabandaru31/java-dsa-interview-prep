package Strings;

public class Countconsecutiveoccurrences {
    public static void main(String[] args) {
        String str="aaaaabbcdeffffgggh";
        int count=1;
        int n=str.length()-1;
        for(int i=0;i<n;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
            }else{
                System.out.print(str.charAt(i)+" : "+count+" ");
                count=1;
            }

        }

        System.out.print(str.charAt(str.length()-1)+": "+count);

    }
}
