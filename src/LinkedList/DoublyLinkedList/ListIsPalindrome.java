package LinkedList.DoublyLinkedList;

public class ListIsPalindrome {
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
        public static boolean palindrome(){
            if(head==null){
                return false;
            }
            while(head!=tail && head.prev!=tail){
                if(head.data!= tail.data){
                    return false;
                }
                head=head.next;
                tail=tail.prev;
            }
            return  true;
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
            head = insertBeginning(1);
            head = insertBeginning(2);
            head = insertBeginning(2);
            head = insertBeginning(1);
            traversal();
            System.out.println(palindrome());

        }

}


