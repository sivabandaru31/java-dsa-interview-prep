package LinkedList.DoublyLinkedList;

public class ListNode {
     ListNode next;
     ListNode prev;
    int data;

    public ListNode(int data){
        this.data=data;
        this.next=null;
        this.prev=null;
    }
    public ListNode(int data,ListNode next,ListNode prev){
        this.data=data;
        this.next=next;
        this.prev=prev;
    }
}
