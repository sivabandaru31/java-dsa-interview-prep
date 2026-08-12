package Strings;

public class ToggleCaseofEachCharecter {
    public static void main(String[] args) {
        String str="siva@KRISHNA";
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isLowerCase(ch)){
                sb.append(Character.toUpperCase(ch));
            }else if(Character.isUpperCase(ch)){
                sb.append(Character.toLowerCase(ch));
            }else{
                sb.append(ch);
            }
        }
        System.out.println(sb);
        //without using built in methods
//        for(int i=0;i<str.length();i++){
//            char ch=str.charAt(i);
//            if(ch >='a' && ch <='z'){
//                sb.append((char) (ch-'a'+'A'));
//            }else if(ch>='A' && ch<='Z'){
//                sb.append((char) (ch-'A'+'a'));
//            }
//        }
//        System.out.println(sb);
    }
}
