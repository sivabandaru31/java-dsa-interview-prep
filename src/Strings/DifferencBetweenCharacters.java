package Strings;

public class DifferencBetweenCharacters {
    public static void main(String[] args) {
        String str="acd";
        int first=0;
        int sum=0;
        StringBuilder sb=new StringBuilder();
        for(int i=1;i<str.length();i++) {
        int differenc=str.charAt(i)-str.charAt(i-1);
            System.out.println(str.charAt(i)+"-"+str.charAt(i-1)+" "+differenc);
            sum+=differenc;
        }
        System.out.println(sum);

    }
}
