package leetCode.LinkedList;

import java.util.List;
import java.util.Scanner;

public class TreeMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Node root;
        LeetCode_102 tree = new LeetCode_102();
        root = tree.createTree(sc);
        tree.dispalyTree(root, 0);
        List<List<Integer>> result = tree.levelOrderTraversal(root);
        System.out.println(result);
    }
}
