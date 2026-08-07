package LinkedList.DoublyLinkedList;

public class DoubleLLInsertionOperations {
    private ListNode head;
    private ListNode tail;
    int size;


 public  ListNode insertatBeginning(int data){
       ListNode newnode=new ListNode(data);
       if(head==null){
           head=newnode;
           tail=newnode;
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
   ListNode insertAtEnd(int data){
     ListNode newnode=new ListNode(data);
     if(head==null){
         head=newnode;
         tail=newnode;
         size++;
         return head;
     }
     //case 1:whe we have tail
//       tail.next=newnode;
//       newnode.prev=tail;
//       tail=newnode;
//       size++;
//       return head;

       //case 2: when we don't have tail
       ListNode temp=head;
     while(temp.next!=null){
         temp=temp.next;
     }
     temp.next=newnode;
     newnode.prev=temp;
     size++;
     return head;
   }
   ListNode insertBeforePosition(int data,int pos){
     ListNode newnode=new ListNode(data);
     if(pos<0){
         System.out.println("Position is not valid. So cant not insert");
     }
     if(pos==1){
         return insertatBeginning(data);
     }
     ListNode temp=head;
     int currpos=1;
     while(temp!=null){
         if(currpos==pos) {
         break;
         }
         temp=temp.next;
         currpos++;
     }
     if(temp==null){
         System.out.println("position is not valid");
         return head;
     }
     ListNode prevNode;
     prevNode=temp.prev;
     newnode.next=temp;
     temp.prev=newnode;
     newnode.prev=prevNode;
     prevNode.next=newnode;
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

    public static void main(String[] args) {
     DoubleLLInsertionOperations dll=new DoubleLLInsertionOperations();

       ListNode head;
        head=dll.insertatBeginning(40);
        head=dll.insertatBeginning(30);
        head=dll.insertatBeginning(20);
        head=dll.insertatBeginning(10);
      //  head=dll.insertAtEnd(50);
        dll.traverseDll();
        dll.insertBeforePosition(50,1);
        dll.traverseDll();
    }
}
