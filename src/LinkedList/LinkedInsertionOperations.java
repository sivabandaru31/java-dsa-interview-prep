package LinkedList;

public class LinkedInsertionOperations {
    Node head;
    Node tail;
    int size;

    void insertionATbeginning(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;

        if(tail==null){
            tail=newnode;
        }
        size++;
    }

    void insertAtEnd(int data){
        Node newnode=new Node(data);
        Node temp=head;
        if(head==null){
            insertionATbeginning(data);
            return;
        }
//        tail.next=newnode;
//        tail=newnode;
//        size++;
        while(temp.next!= null){
            temp=temp.next;
        }
        temp.next=newnode;
        temp=newnode;
        size++;
    }
    void SpecficPosition(int data,int pos){

        Node newnode=new Node(data);
        Node temp=head;
        int curr=1;
        //int pos=3;
        if(pos<0 || pos>size+1){
            System.out.println("invalid position enter valid position");
            return;
        }
        if(head==null){
//            newnode.next=head;
//            head=newnode;
            insertionATbeginning(data);
            return;
        }
        if(pos==1){
            newnode.next=head;
            head=newnode;
            return;

        }

        while(curr<pos-1){
            temp=temp.next;
            curr++;
        }
        newnode.next=temp.next;
        temp.next=newnode;
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
