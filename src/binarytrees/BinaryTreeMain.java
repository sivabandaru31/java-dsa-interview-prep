package binarytrees;

import java.util.Scanner;

public class BinaryTreeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       // BinaryTree tree=new BinaryTree();
       Node root;
       //root=tree.createTree(sc);
//        //System.out.println(root.data);
       // tree.displayTree(root,0);
//        tree.inorderTraversal(root);
        //InOrder inorder=new InOrder();
        //Node root;
       // root=inorder.createTree(sc);
        //System.out.println(root.data);
        //inorder.displayTree(root,0);
        //inorder.inorderTraversal(root);
        //tree.preOrderTraversal(root);
        //tree.postOrderTraversal(root);
        //tree.levelOrderTraversal(root);
//        LevelOrderTraversal tree=new LevelOrderTraversal();
//      Node root=tree.createTree(sc);
//      tree.levelOrderTraversal(root);

        BinaryTreeLevelOrderTraversal_102 tree=new BinaryTreeLevelOrderTraversal_102();
         root=tree.createTree(sc);
        tree.dispalyTree(root,0);
       tree.levelOrederTraversal(root);

    }

}
