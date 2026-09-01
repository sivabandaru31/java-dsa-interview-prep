package Strings;

public class Stringreverse {
    public static void main(String[] args) {
        //String str="sivakrishna";
        //for (int i=str.length()-1;i>0;i--){
        //    System.out.print(str.charAt(i));
        // String str1="bhargav vinakonda";
        //for(int i=str1.length()-1;i>=0;i--){
        //  System.out.print(str1.charAt(i));
        // }
      /*  StringBuilder str=new StringBuilder("sivakrishna");
        int left=0,right=str.length()-1;
        while(left<=right){
            char leftchar=str.charAt(left);
            char rightchar=str.charAt(right);
            str.setCharAt(left,rightchar);
            left++;
            right--;
            //System.out.println(str);

        }
        System.out.println(str.toString());*/
        StringBuilder str1=new StringBuilder("Neelima");
        int left=0;
        int right=str1.length()-1;
        while(left<right){
            char leftchar= str1.charAt(left);
            char rightchar=str1.charAt(right);
            str1.setCharAt(left,rightchar);
            left++;
            right--;

        }
        System.out.println(str1);

    }

}
