package binarytrees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class LevelOrderTraversal {
    Node createTree(Scanner sc){
        System.out.println("Enter Node Data");
        int value=sc.nextInt();
        if(value==-1){
            return null;
        }

        Node newnode=new Node(value);
        System.out.println("do you want to left chaild "+value);
        boolean left=sc.nextBoolean();
        if(left){
            newnode.left=createTree(sc);
        }
        System.out.println("do you want to right chaild "+value);
        boolean right=sc.nextBoolean();
        if(right){
            newnode.right=createTree(sc);
        }
        return newnode;

    }
    void dispalyTree(Node node,int level){
        if(node==null){
            return;
        }

        dispalyTree(node.right,level+1);
        for(int i=0;i<level;i++){
            System.out.println("    ");
            System.out.println(node.data);
            dispalyTree(node.left,level+1);
        }
    }
    void levelOrderTraversal(Node root){
        Queue<Node> q=new LinkedList<>();

        q.add(root);
        while(!q.isEmpty()){
            Node currentNode=q.remove();
            System.out.println(currentNode.data+" ");
            if(currentNode.left!=null){
                q.add(currentNode.left);
            }
            if(currentNode.right!=null){
                q.add(currentNode.right);
            }
        }
    }
}
