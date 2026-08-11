package LinkedList.DoublyLinkedList;

public class SearchValueinDLL {
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

    public static ListNode searchAnElement(int val) {
        ListNode temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
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
    //ListNode head;
    ListNode temp;
    head = insertBeginning(40);
    head = insertBeginning(30);
    head = insertBeginning(20);
    head = insertBeginning(10);
    traversal();
    temp = searchAnElement(10);
    if (temp != null) {
        System.out.println(temp.data);
    } else {
        System.out.println("element not found");
    }
}

}
