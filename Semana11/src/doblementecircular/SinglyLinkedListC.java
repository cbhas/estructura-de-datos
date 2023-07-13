package doblementecircular;

public class SinglyLinkedListC {

    public Node head = null;
    public Node tail = null;

    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            head.previous = tail;
            tail.next = head;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = head;
            head.previous = tail;
        }
    }
    
    public void printHeadTail() {
        Node current = head;
        
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Nodes of the circular linked list :");
            
            do {
                System.out.println("" + current.data);
                current = current.next;
            } while (current != head);
            System.out.print("");
        }
    }
    
    public void printTailHead() {
        Node current = tail;
        
        if (tail == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Nodes of the circular linked list:");
            
            do {
                System.out.println("" + current.data);
                current = current.previous;
            } while (current != tail);
            System.out.print("");
        }
    }


}
