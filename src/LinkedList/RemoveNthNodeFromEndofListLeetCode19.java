package LinkedList;

public class RemoveNthNodeFromEndofListLeetCode19 {
    Node head;
    public Node convertArrayIntoLinkedList(int[] arr){
        if(arr==null|| arr.length==0){
            return null;
        }
        head=new Node(arr[0]);
        Node temp=head;
        for(int i=1;i<arr.length;i++){
            Node newNode=new Node(arr[i]);
            temp.next=newNode;
            temp=newNode;
        }
        return  head;
    }
    public void traversal(Node head){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("End");
    }

    // Approch: 1 -->Brut force
   /* public Node removeNthNodeFromEnd(Node head,int n){
        Node temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(size==n){
            head=head.next;
            return  head;
        }
        int pos=size-n;
        temp=head;
        int i=1;
        while(i<pos){
            temp=temp.next;
            i++;
        }
        temp.next=temp.next.next;
        return head;
    }*/

    // Approch: 2 -->Optial approch
    public Node removeNthNodeFromEnd(Node head,int n){
        Node slow=head;
        Node fast=head;
        for(int i=0;i<n;i++){
            fast=fast.next;
        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return  head;
    }

    public static void main(String[] args) {
        int[] arr={10,3,2,5,6};
        Node newhead;
        RemoveNthNodeFromEndofListLeetCode19 obj=new RemoveNthNodeFromEndofListLeetCode19();
        newhead=obj.convertArrayIntoLinkedList(arr);
        obj.traversal(newhead);
        newhead=obj.removeNthNodeFromEnd(newhead,5);
        obj.traversal(newhead);
    }
}
