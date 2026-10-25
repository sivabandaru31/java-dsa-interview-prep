package binarytrees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTreeLevelOrderTraversal_102 {
    Node  createTree(Scanner sc){
        System.out.println("Enter Node Data(-1 for null)");
        int value=sc.nextInt();
        Node newNode =new Node( value);
        if(value==-1){
            return null;
        }
        System.out.println("Do you want to left chaild of "+value);
        boolean left=sc.nextBoolean();
        if(left){
            newNode.left=createTree(sc);
        }

        System.out.println("Do you want to right chaild "+value);
        boolean right =sc.nextBoolean();

        if(right){
            newNode.right=createTree(sc);
        }
        return newNode;
    }

    void dispalyTree(Node node,int level){
        if(node==null){
            return;
        }
        dispalyTree(node.right,level+1);
        for(int i=0;i<level;i++){
            System.out.print("    ");
        }
        System.out.println(node.data);
        dispalyTree(node.left,level+1);
    }
    void levelOrederTraversal(Node root){
        if(root==null){
            return;
        }
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            Node currentNode=q.remove();
            System.out.print(currentNode.data+" ");
            if(currentNode.left!=null){
                q.add(currentNode.left);
            }
            if(currentNode.right!=null){
                q.add(currentNode.right);
            }
        }
    }
}
