package doblementecircular;

public class Node {

    int data;
    Node previous;
    Node next;

    Node(int d) {
        data = d;
        previous = null;
        next = null;
    }
    Node head = null;
    Node tail = null;
    
}
