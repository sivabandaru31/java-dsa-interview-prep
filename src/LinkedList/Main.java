package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedInsertionOperations op=new LinkedInsertionOperations();
        op.insertionATbeginning(40);
        op.insertionATbeginning(30);
        op.insertionATbeginning(20);
        op.insertionATbeginning(10);
        op.insertAtEnd(50);
        op.SpecficPosition(7,0);
        op.Traversal();
    }
}
