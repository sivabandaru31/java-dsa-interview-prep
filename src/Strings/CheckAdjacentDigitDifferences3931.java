package Strings;

public class CheckAdjacentDigitDifferences3931 {
    public  static boolean checkAdjacentDigitDifferences(String s){
        for(int i=1;i<s.length();i++) {
            int differenc=s.charAt(i)-s.charAt(i-1);
            System.out.println(s.charAt(i)+"-"+s.charAt(i-1)+" "+differenc);
            if( differenc<0 && differenc>2){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkAdjacentDigitDifferences("132"));

    }
}
