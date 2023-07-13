package resolucionproblema;

public class ResolucionProblema {

    class Node {

        int data;
        String nombre;
        String cedula;
        Node next;

        Node(int d, String n, String c) {

            data = d;
            nombre = n;
            cedula = c;
            next = null;
        }
    }

    Node head;

    public ResolucionProblema insertar(ResolucionProblema list, int data,
            String n, String c) {

        Node newNode = new Node(data, n, c);
        newNode.next = null;

        if (list.head == null) {
            list.head = newNode;
        } else {
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }
        return list;
    }

    public void print(ResolucionProblema list) {

        Node currentNode = list.head;
        System.out.print("  Número de Turnos:\n");
        while (currentNode != null) {
            System.out.print("  " + currentNode.data + " - " + currentNode.nombre + " - " + currentNode.cedula + "\n");
            currentNode = currentNode.next;
        }
    }

    public ResolucionProblema delete(ResolucionProblema list, int key) {

        Node currentNode = list.head;
        Node prev = null;

        if (currentNode != null && currentNode.data == key) {
            list.head = currentNode.next;
            return list;
        }

        while (currentNode != null && currentNode.data != key) {
            prev = currentNode;
            currentNode = currentNode.next;
        }

        if (currentNode != null) {
            prev.next = currentNode.next;
            System.out.println("  Ticket Eliminado...");
        }

        if (currentNode == null) {
            System.out.println("  Ticket no Encontrado!");
        }

        return list;

    }

}
