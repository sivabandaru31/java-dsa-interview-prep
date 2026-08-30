package Stacks;

import java.util.Stack;

public class PrefixToInfix {
    public static String prefixtoInfix(String exp){
        Stack<String> stack=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                stack.push(ch+"");
            }else{
                String op1=stack.pop();
                String op2=stack.pop();
                String updatedop="("+op1+ch+op2+")";
                stack.push(updatedop);
            }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String expression="-+a*bc-/de+fg";
        String infix=prefixtoInfix(expression);
        System.out.println(infix);
    }
}
