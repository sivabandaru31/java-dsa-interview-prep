package LinkedList;

public class ArrayToLinkedList {
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
    public static void main(String[] args) {
        int[] arr={10,3,2,5,6,8,2,4,4};
        Node newhead;
        ArrayToLinkedList al=new ArrayToLinkedList();
        newhead=al.convertArrayIntoLinkedList(arr);
        al.traversal(newhead);
    }
}
