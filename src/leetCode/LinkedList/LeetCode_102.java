package leetCode.LinkedList;
import java.util.*;
//package binarytrees;
import java.util.*;


public class LeetCode_102 {
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
        public  List<List<Integer>> levelOrderTraversal(Node node){
            List<List<Integer>> list=new ArrayList<>();
            if(node==null){
                return list;
            }
            Queue<Node> q=new LinkedList<>();
            q.add(node);
            while(!q.isEmpty()){
                List<Integer> sublist=new ArrayList<>();
                int levelsize=q.size();

                for(int i=0;i<levelsize;i++){
                    Node current=q.remove();
                    sublist.add(current.data);
                    if(current.left!=null){
                        q.add(current.left);
                    }
                    if(current.right!=null){
                        q.add(current.right);
                    }
                }
                list.add(sublist);

            }
            return list;
        }

    }


