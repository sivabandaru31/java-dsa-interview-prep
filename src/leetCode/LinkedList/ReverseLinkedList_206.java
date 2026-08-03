package leetCode.LinkedList;

import LinkedList.Node;

public class ReverseLinkedList_206 {
    static ListNode head;
    static ListNode tail;
    static int size;
    void insertionATbeginning(int data){
        ListNode newnode=new ListNode(data);
        newnode.next=head;
        head=newnode;

        if(tail==null){
            tail=newnode;
        }
        size++;
    }
    public  void reverseALinkedList(){
        if(head==null){
            System.out.println("list is empty cant reverse");
        }
        if(head.next==null){
            System.out.println("only element in the list");
        }
        ListNode temp,prevnode,nextnode;
        temp=head;
        prevnode=null;
        while(temp!=null){
            nextnode=temp.next;
            temp.next=prevnode;
            prevnode=temp;
            temp=nextnode;
        }
        head=prevnode;
        System.out.println();
    }
    public void Traversal(){
        ListNode temp=head;
        if(head==null){
            System.out.println("list is empty");
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.print("End");
    }
    }

