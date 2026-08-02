package LinkedList;

public class ReverseLinkedList {
   static Node head;
   static Node tail;
   static int size;
    void insertionATbeginning(int data){
        Node newnode=new Node(data);
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
        Node temp,prevnode,nextnode;
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
        Node temp=head;
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
