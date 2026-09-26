package arrays;

public class CountOvelsConsonents {
    public static void ovelsandConsonents(String str){
        int ovels=0;
        int consonent=0;
        for(int i=0;i<str.length();i++){
            char ch=Character.toLowerCase(str.charAt(i));
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                ovels++;
            }else{
                if(ch!=' '){
                    consonent++;
                }
            }
        }
        System.out.println("ovels: "+ovels);
        System.out.println("consonents: "+consonent);
    }
    public static void main(String[] args) {
        String str="Hello Worldie";
        ovelsandConsonents(str);
    }
}
