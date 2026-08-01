package LinkedList;

public class DeletionOperationLL {
    static Node head;
    int size;
    Node tail;
    public  void insert(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
        if(tail==null){
            tail=newnode;
        }
        size++;
    }
    public void deletingFromBeginning(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        head=head.next;
        size--;
        if(head==null){
            tail=null;
        }
    }
    public void deleteFormEnd(){
        Node temp=head;
        if (head == null) {
            System.out.println("list is empty");
        }
        if(head.next==null){
            head=head.next;
            tail=null;
            size--;
            return;
        }
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public void deleteAtSpecficPosition(int pos){
        if(head==null){
            System.out.println("List is empty");
        }
        if(pos==1){
            deletingFromBeginning();
            return;
        }
        if(pos<=0 || pos>=size){
            System.out.println(" given Position is not valid  can't delete ");
            return;
        }
        Node temp=head;
        int currpos=1;
        //int pos=3;
        Node prev=null;
        while(currpos<pos-1){
            temp=temp.next;
            currpos++;
        }
        System.out.println("deleted element: "+temp.next.data);
        temp.next=temp.next.next;
        size--;
    }

    public void deleteValue(int val){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.data==val){
            System.out.println("deleted value: "+head.data);
            head=head.next;

        }
        Node temp=head;
        Node prevnode=null;
        while((temp!=null) && (temp.data !=val)){
            prevnode=temp;
            temp=temp.next;
        }
        if(temp != null){
            System.out.println("deleted node is: "+temp.data);
            prevnode.next=temp.next;
            size--;
        }
    }
    public  void traversal(){
        Node temp=head;
        while(temp.next!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("End");
    }
}
