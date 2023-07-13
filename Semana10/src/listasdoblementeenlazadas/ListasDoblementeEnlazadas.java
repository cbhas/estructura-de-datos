package listasdoblementeenlazadas;

public class ListasDoblementeEnlazadas {

    class Node {

        int data;
        Node previous;
        Node next;

        public Node(int d) {
            data = d;
        }
    }
    Node head, tail = null;

    public void insertAntesCabeza(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            head.previous = newNode;
            newNode.next = head;
            head = newNode;
            head.previous = null;
        }
    }

    public void printInicioFin() {
        Node current = head;

        if (head == null) {
            System.out.println("Lista vacía!!");
            return;
        }

        System.err.println("Nodos de inicio a fin:");
        while (current != null) {
            System.out.print("[" + current.data + "] ");
            current = current.next;
        }
    }

    public void insertDespuesCabeza(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            head.previous = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    public void printFinInicio() {
        Node current = tail;

        if (head == null) {
            System.out.println("Lista vacía!!");
            return;
        }

        System.err.println("Nodos de fin a inicio:");
        while (current != null) {
            System.out.print("[" + current.data + "] ");
            current = current.previous;
        }
        System.out.println("");
    }
}
