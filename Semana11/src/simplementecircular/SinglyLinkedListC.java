package simplementecircular;

public class SinglyLinkedListC {

    public Node head = null;
    public Node tail = null;

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }
    }
    
    public void print() {
        Node current = head;
        
        if (head == null) {
            System.out.println("List is empty");
        } else {
            System.out.println("Nodes of the circular linked list:");
            
            do {
                System.out.println("" + current.data);
                current = current.next;
            } while (current != head);
            System.out.print("");
        }
    }

}
