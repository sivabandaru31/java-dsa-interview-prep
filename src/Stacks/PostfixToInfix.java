package Stacks;

import java.util.Stack;

public class PostfixToInfix {
    public static String postfitToInfix(String exp){
        Stack<String> stack=new Stack<>();
        for(char ch:exp.toCharArray()){
           if(Character.isLetterOrDigit(ch)){
               stack.push(ch+"");
           }else{
              String op1= stack.pop();
              String op2=stack.pop();
              String updatedop="("+op2+ch+op1+")";
              stack.push(updatedop);
           }
        }
        return stack.pop();
    }
    public static void main(String[] args) {
        String expression="ab+cd-*e/";
        String prefix=postfitToInfix(expression);
        System.out.println(prefix);
    }
}
