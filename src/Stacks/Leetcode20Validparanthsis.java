package Stacks;

import java.util.Stack;

public class Leetcode20Validparanthsis {
    static boolean validparanthsis(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<=s.length()-1;i++){
            char ch=s.charAt(i);
            if(ch!='(' && ch!='{' && ch!='[' && ch!=')' &&ch!='}'&& ch!=']'){
                continue;
            }
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }else {
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if(ch==')' &&  top!='(' ||
                        (ch=='}' && top!='{')||
                        (ch==']' && top!='[')){
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String s="({[1+3*2]})";
        boolean result= validparanthsis(s);
        System.out.println(result);

    }
}
