package leetCode.LinkedList.DoublyLinkedList;

public class ListNode {
    int data;
    ListNode head;
    ListNode prev;

    public ListNode(int data){
        this.data=data;
        this.head=null;
        this.prev=null;
    }

    public ListNode(int data,ListNode next,ListNode prev){
        this.data=data;
        this.head=head;
        this.prev=prev;
    }
}
