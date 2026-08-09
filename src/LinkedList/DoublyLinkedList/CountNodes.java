package LinkedList.DoublyLinkedList;

public class CountNodes {
   static ListNode head;
  static  ListNode tail;
  static  int size;
    public  static ListNode insertBeginning(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            size++;
            return head;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        size++;
        return head;
    }
    public static int count(){
//        int count=0;
//        ListNode temp=head;
//        while(temp!=null){
//            count++;
//            temp=temp.next;
//        }
//        return count;
        return size;
    }
    public  static void traversal(){
        ListNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("End");
    }
    public static void main(String[] args) {
        ListNode head;
        head=insertBeginning(40);
        head=insertBeginning(30);
        head=insertBeginning(20);
        head=insertBeginning(10);
        traversal();
        int result=count();
        System.out.println(result);

    }
}
