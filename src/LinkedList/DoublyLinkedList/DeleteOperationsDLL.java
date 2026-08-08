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
    public ListNode deleteFromEnd(){
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
        ListNode temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        ListNode prevNode;
        prevNode=temp.prev;
        temp=prevNode;
        prevNode.next=null;
        temp.prev=null;
        size--;
        return head;
    }
    public   ListNode deleteAtSpecficPosition( int pos){
        if(head==null){
            System.out.println("List is empty cant delete");
            return head;
        }
        if(head.next==null || pos==1){
           return  deleteFromBeginning();
        }
        int currpos=1;
        ListNode temp=head;
        while(temp!=null){
            if(currpos==pos){
                break;
            }
            temp=temp.next;
            currpos++;
        }
        if(temp==null){
            System.out.println("given position is not valid so can't delete");
            return head;
        }
        ListNode prevNode=temp.prev;
        ListNode nextNode =temp.next;
        prevNode.next=temp.next;
        if(nextNode!=null){
            nextNode.prev=prevNode;
            temp.next=null;
        }
        temp.prev=null;
        //nextNode.prev=prevNode;
        size--;
        return head;

    }
    public static void main(String[] args) {
        DeleteOperationsDLL deleteDll=new DeleteOperationsDLL();
        ListNode head;
        head=deleteDll.insertatBeginning(40);
        head =deleteDll.insertatBeginning(30);
        head= deleteDll.insertatBeginning(20);
        head= deleteDll.insertatBeginning(10);
         //deleteDll.traverseDll();
//         head=deleteDll.deleteFromBeginning();
//         deleteDll.traverseDll();
//         head=deleteDll.deleteFromEnd();
         deleteDll.traverseDll();
         head=deleteDll.deleteAtSpecficPosition(2);
         deleteDll.traverseDll();
    }
}
