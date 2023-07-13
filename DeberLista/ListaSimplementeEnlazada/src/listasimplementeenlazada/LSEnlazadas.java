package listasimplementeenlazada;

public class LSEnlazadas {

    // Clase interna que representa un nodo de la lista enlazada
    class Nodo {

        int dato;
        Nodo siguiente;

        Nodo(int d) {
            dato = d;
            siguiente = null;
        }
    }

    Nodo cabeza; // Puntero al primer nodo de la lista

    // Método para insertar un dato al final de la lista enlazada
    public LSEnlazadas insertar(LSEnlazadas lista, int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        nuevoNodo.siguiente = null;

        // Si la lista está vacía, el nuevo nodo se convierte en la cabeza
        if (lista.cabeza == null) {
            lista.cabeza = nuevoNodo;
        } else {
            // Si la lista no está vacía, se busca el último nodo y se enlaza el nuevo nodo
            Nodo ultimo = lista.cabeza;
            while (ultimo.siguiente != null) {
                ultimo = ultimo.siguiente;
            }
            ultimo.siguiente = nuevoNodo;
        }

        return lista;
    }

    // Método para imprimir los nodos de la lista enlazada
    public void imprimir(LSEnlazadas lista) {
        Nodo nodoActual = lista.cabeza;

        System.out.println("  Nodos de cabeza a cola:");

        while (nodoActual != null) {
            System.out.print("  [ ");
            System.out.print(nodoActual.dato);
            System.out.print(" ] ");
            nodoActual = nodoActual.siguiente;
        }

        System.out.println("");
    }

    // Método para eliminar un nodo con un valor específico de la lista enlazada
    public LSEnlazadas eliminar(LSEnlazadas lista, int clave) {
        Nodo nodoActual = lista.cabeza;
        Nodo previo = null;

        // Caso especial: el nodo a eliminar es la cabeza
        if (nodoActual != null && nodoActual.dato == clave) {
            lista.cabeza = nodoActual.siguiente;
            System.out.print("======================================================\n");
            System.out.println("  El número " + clave + " ha sido encontrado y eliminado!");
            System.out.print("======================================================\n");
            return lista;
        }

        // Buscar el nodo a eliminar
        while (nodoActual != null && nodoActual.dato != clave) {
            previo = nodoActual;
            nodoActual = nodoActual.siguiente;
        }

        // Si se encontró el nodo a eliminar
        if (nodoActual != null) {
            System.out.print("======================================================\n");
            System.out.println("  El número " + clave + " ha sido encontrado y eliminado!");
            System.out.print("======================================================\n");
        }

        // Si no se encontró el nodo a eliminar
        if (nodoActual == null) {
            System.out.print("======================================================\n");
            System.out.println("  El número " + clave + " no ha sido encontrado!");
            System.out.print("======================================================\n");
        }

        return lista;
    }

}

// @cbhas
