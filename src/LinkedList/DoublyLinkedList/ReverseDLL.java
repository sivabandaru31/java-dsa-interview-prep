package LinkedList.DoublyLinkedList;

public class ReverseDLL {
    static ListNode head;
    static ListNode tail;
    static int size;

    public static ListNode insertBeginning(int data) {
        ListNode newNode = new ListNode(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
            size++;
            return head;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        size++;
        return head;
    }

   public static ListNode reversedll(){
        if(head==null){
            System.out.println("list is emptyu");
            return head;
        }
        ListNode temp=head;
        ListNode currpos=null;

        while(temp!=null){
            currpos=temp.prev;
            temp.prev=temp.next;
            temp.next=currpos;
            temp=temp.prev;

        }
        head=currpos.prev;
        return  head;
   }

    public static void traversal() {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
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
        head=reversedll();
        traversal();
    }

}
