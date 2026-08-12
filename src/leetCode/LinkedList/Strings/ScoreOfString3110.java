package leetCode.LinkedList.Strings;

public class ScoreOfString3110 {
    public static void main(String[] args) {
        String str="acd";
        int sum=0;
        for(int i=1;i<str.length();i++) {
            int differenc=Math.abs(str.charAt(i)-str.charAt(i-1));
            //System.out.println(str.charAt(i)+"-"+str.charAt(i-1)+" "+differenc);
            sum+=differenc;
        }
        System.out.println(sum);

    }
}
