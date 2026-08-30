package Stacks;
import java.util.Stack;

public class InfixToPrefix {
    public static int precedence(char op){
        switch(op){
            case '^':return 3;
            case '*','/':return 2;
            case '+','-':return 1;
        }
        return -1;
    }
//    public static  boolean isRightAssociative(int op){
//        return op=='^';
//    }
    public static String reverseANDSwap(String exp){
        StringBuilder rev=new StringBuilder();
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            if(ch=='('){
                rev.append(')');
            }else if(ch==')'){
                rev.append('(');
            }else{
                rev.append(ch);
            }
        }
        return rev.toString();
    }
    public static String infixTOPrefix(String exp){
        String updatedExpression=reverseANDSwap(exp);
        String postfix=infixToPostfix(updatedExpression);
//        StringBuilder sb=new StringBuilder();
//        for(int i=postfix.length()-1;i>=0;i--){
//            char ch=postfix.charAt(i);
//            sb.append(ch);
//        }
//        return sb.toString();
        return reverseANDSwap(postfix);
    }
    public static String infixToPostfix(String exp){
        StringBuilder output=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(char ch:exp.toCharArray()){
            if(Character.isLetterOrDigit(ch)){
                output.append(ch);
            }
            else if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                while(!stack.isEmpty() && stack.peek()!='('){
                    output.append(stack.pop());
                }
                stack.pop();
            }
            else {
                while(!stack.isEmpty() && stack.peek()!='(' &&
                (precedence(ch) < precedence(stack.peek()) ||
                        precedence(ch)==precedence(stack.peek()) && ch=='^')){
                    output.append(stack.pop());
                }
                stack.push(ch);
            }
        }
        while(!stack.isEmpty()){
            output.append(stack.pop());
        }
        return output.toString();

    }
    public static void main(String[] args) {
        String str="(a+b)*c-d+f";
        String prefix=infixTOPrefix(str);
        System.out.println(prefix);
       // System.out.println(reverseANDSwap(prefix));
    }
}
