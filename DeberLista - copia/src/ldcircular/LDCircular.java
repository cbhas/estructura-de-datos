package ldcircular;

public class LDCircular {

    public class Nodo {

        int dato;
        Nodo anterior;
        Nodo siguiente;

        Nodo(int d) {
            dato = d;
            anterior = null;
            siguiente = null;
        }
    }

    public Nodo cabeza = null; // Puntero al primer nodo de la lista circular
    public Nodo cola = null; // Puntero al último nodo de la lista circular

    // Método para insertar un nuevo nodo al final de la lista circular
    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        // Si la lista está vacía, el nuevo nodo se convierte en la cabeza y la cola,
        // y se enlaza a sí mismo
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            cabeza.anterior = cola;
            cola.siguiente = cabeza;

        } else {
            // Si la lista no está vacía, se enlaza el nuevo nodo después de la cola actual
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
            cola.siguiente = cabeza;
            cabeza.anterior = cola;
        }
    }

    // Método para imprimir los nodos de la lista circular
    public void imprimir() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        Nodo actual = cabeza;

        System.out.println("Nodos de la lista enlazada circular:");

        while (true) {
            System.out.print("[ " + actual.dato + " ] ");
            actual = actual.siguiente;

            if (actual == cabeza) {
                break;
            }

        }

        System.out.println();
    }

    // Método para eliminar un nodo con un valor específico de la lista circular
    public LDCircular eliminar(LDCircular lista, int clave) {
        Nodo nodoActual = lista.cabeza;

        // Caso especial: si el nodo a eliminar es la cabeza
        if (nodoActual != null && nodoActual.dato == clave) {
            lista.cabeza = nodoActual.siguiente;
            if (lista.cabeza != null) {
                lista.cabeza.anterior = lista.cola;
                lista.cola.siguiente = lista.cabeza;

            } else {
                lista.cola = null;
            }

            System.out.print("======================================================\n");
            System.out.println("El número " + clave + " ha sido encontrado y eliminado");
            System.out.print("======================================================\n");
            return lista;
        }

        // Buscar el nodo a eliminar
        while (nodoActual != null && nodoActual.dato != clave) {
            nodoActual = nodoActual.siguiente;
        }

        // Si se encontró el nodo a eliminar
        if (nodoActual != null) {
            Nodo anterior = nodoActual.anterior;
            Nodo siguiente = nodoActual.siguiente;

            // Actualizar los enlaces
            if (anterior != null) {
                anterior.siguiente = siguiente;
            }

            if (siguiente != null) {
                siguiente.anterior = anterior;
            }

            // Actualizar la cabeza y la cola si se eliminó el último nodo
            if (nodoActual == lista.cabeza) {
                lista.cabeza = siguiente;
            }

            if (nodoActual == lista.cola) {
                lista.cola = anterior;
            }

            System.out.print("======================================================\n");
            System.out.println("El número " + clave + " ha sido encontrado y eliminado");
            System.out.print("======================================================\n");

        } else {
            System.out.print("======================================================\n");
            System.out.println("El número " + clave + " no ha sido encontrado");
            System.out.print("======================================================\n");
        }

        return lista;
    }

}
