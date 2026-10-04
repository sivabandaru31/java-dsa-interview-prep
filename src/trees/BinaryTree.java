package trees;

import java.util.Scanner;

public class BinaryTree {

    Node createTree(Scanner sc){
        System.out.println("Enter Node Data(-1 for null)");
        int value=sc.nextInt();
        Node newNode=new Node(value);
        if(value==-1){
            return null;
        }
        //insertion in leftchaild
        System.out.println("Do you want to left chaild of "+value);
        boolean left=sc.nextBoolean();
        if(left){

           newNode.left= createTree(sc);
        }

        //insertion of right chaild

        System.out.println("do you want to right chaild of "+value);
        boolean right=sc.nextBoolean();
        if(right){
            newNode.right=createTree(sc);
        }
        return newNode;
    }
}
