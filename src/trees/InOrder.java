package trees;

import java.util.Scanner;

public class InOrder {
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

    void displayTree(Node node,int level){
        if(node==null){
            return;
        }
        displayTree(node.right,level+1);
        for(int i=0;i<level;i++){
            System.out.print ("    ");
        }
        System.out.println(node.data);
        displayTree(node.left,level+1);
    }
    void inorderTraversal(Node node){
        if(node==null){
            return;
        }
        inorderTraversal(node.left);
        System.out.print(node.data+" ");
        inorderTraversal(node.right);
    }
}
