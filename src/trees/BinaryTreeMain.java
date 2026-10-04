package trees;

import java.util.Scanner;

public class BinaryTreeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        BinaryTree tree=new BinaryTree();
        Node root;
        root=tree.createTree(sc);
        System.out.println(root.data);
    }

}
