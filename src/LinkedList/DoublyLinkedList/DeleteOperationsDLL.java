package LinkedList.DoublyLinkedList;

public class DeleteOperationsDLL {
    private  ListNode head;
    private ListNode tail;
    int size;

    public  ListNode insertatBeginning(int data) {
        ListNode newnode = new ListNode(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
            size++;
            //System.out.println(head.data);
            return head;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        size++;
        return head;
    }
    void traverseDll(){
        if(head==null){
            System.out.println("list is empty");
        }else {
            ListNode temp = head;
            while (temp!=null){
                System.out.print(temp.data+"-->");
                temp=temp.next;
            }
            System.out.println("End");
        }
    }


    ListNode deleteFromBeginning(){
        if(head==null){
            System.out.println("List is empth can't delete");
            return head;
        }
        if(head.next==null){
            head=null;
            tail=null;
            size--;
            return head;
        }
        ListNode prevNode;
        prevNode=head;
        head=head.next;
        prevNode.next=null;
        size--;
        return head;
    }
    public static void main(String[] args) {
        DeleteOperationsDLL deleteDll=new DeleteOperationsDLL();
        ListNode head;
        head=deleteDll.insertatBeginning(40);
//        head =deleteDll.insertatBeginning(30);
//        head= deleteDll.insertatBeginning(20);
//        head= deleteDll.insertatBeginning(10);
         //deleteDll.traverseDll();
         head=deleteDll.deleteFromBeginning();
         deleteDll.traverseDll();
    }
}
