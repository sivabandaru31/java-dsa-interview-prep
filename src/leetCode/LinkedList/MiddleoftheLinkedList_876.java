package leetCode.LinkedList;

public class MiddleoftheLinkedList_876 {
    static  ListNode head;
    static ListNode tail;
    static int size;


    public  void insertion(int data){
        ListNode newnode =new ListNode(data);
        newnode.next=head;
        head=newnode;
        size++;
    }
    public  void middleoftheLinkedlist(){
        ListNode temp=head;
       size=size/2;
       int currpos=1;
       while(temp!=null) {
           if (currpos > size) {
               System.out.print(temp.data+"-->");
               //temp = temp.next;
               //currpos++;
               //return temp.data;
           }
           temp=temp.next;
           currpos++;
       }
        System.out.println("End");
    }
    public  void traversal(){
        if(head==null){
            System.out.println("List is Empty");
        }
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("End");
    }

}
