package listasimplementecircular;

public class LSCircular {

    public class Nodo {

        int dato;
        Nodo siguiente;

        Nodo(int d) {
            dato = d;
            siguiente = null;
        }
    }

    public Nodo cabeza = null; // Puntero al primer nodo de la lista circular
    public Nodo cola = null; // Puntero al último nodo de la lista circular

    // Método para agregar un nuevo nodo al final de la lista circular
    public void agregar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        // Si la lista está vacía, el nuevo nodo se convierte en la cabeza y la cola,
        // y se enlaza a sí mismo
        if (cabeza == null) {
            cabeza = nuevoNodo;
            cola = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
        } else {
            // Si la lista no está vacía, se enlaza el nuevo nodo después de la cola actual
            cola.siguiente = nuevoNodo;
            cola = nuevoNodo;
            cola.siguiente = cabeza; // Se cierra el círculo enlazando la cola con la cabeza
        }
    }

    // Método para eliminar un nodo con un valor específico de la lista circular
    public void eliminar(int clave) {
        if (cabeza == null) {
            System.out.println("  La lista está vacía");
            return;
        }

        Nodo actual = cabeza;
        Nodo previo = null;

        // Caso especial: eliminar la cabeza
        if (actual.dato == clave) {
            cabeza = actual.siguiente;
            cola.siguiente = cabeza; // Actualizar la cola enlazándola a la nueva cabeza
            System.out.print("======================================================\n");
            System.out.println("  El número " + clave + " ha sido encontrado y eliminado");
            System.out.print("======================================================\n");
            return;
        }

        // Buscar el nodo a eliminar
        while (actual.siguiente != cabeza && actual.dato != clave) {
            previo = actual;
            actual = actual.siguiente;
        }

        // Si se encontró el nodo a eliminar
        if (actual.dato == clave) {
            previo.siguiente = actual.siguiente;
            // Si se eliminó el último nodo, actualizar la cola enlazándola al nuevo último nodo
            if (actual == cola) {
                cola = previo;
                cola.siguiente = cabeza;
            }

            System.out.print("======================================================\n");
            System.out.println("  El número " + clave + " ha sido encontrado y eliminado");
            System.out.print("======================================================\n");

        } else {
            System.out.print("======================================================\n");
            System.out.println("  El número " + clave + " no ha sido encontrado");
            System.out.print("======================================================\n");
        }

    }

    // Método para imprimir los nodos de la lista circular
    public void imprimir() {
        if (cabeza == null) {
            System.out.println("  La lista está vacía");
            return;
        }

        Nodo actual = cabeza;

        System.out.println("  Nodos de la lista enlazada circular:");

        while (true) {
            System.out.print("  [ " + actual.dato + " ] ");
            actual = actual.siguiente;

            if (actual == cabeza) {
                break;
            }

        }

        System.out.println();
    }

}

// @cbhas
