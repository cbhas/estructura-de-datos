package listasdoblementeenlazadas;

public class LDEnlazadas {

    // Clase interna que representa un nodo de la lista enlazada
    class Nodo {

        int dato;
        Nodo anterior;
        Nodo siguiente;

        public Nodo(int d) {
            dato = d;
        }
        
    }

    Nodo cabeza = null; // Puntero al primer nodo de la lista
    Nodo cola = null; // Puntero al último nodo de la lista

    // Método para insertar un nuevo nodo después de la cabeza de la lista
    public void insertarDespuesDeCabeza(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        // Si la lista está vacía, el nuevo nodo se convierte en la cabeza y la cola
        if (cabeza == null) {
            cabeza = cola = nuevoNodo;
            cabeza.anterior = null;
            cola.siguiente = null;
        } else {
            // Si la lista no está vacía, se enlaza el nuevo nodo después de la cola actual
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
            cola.siguiente = null;
        }
    }

    // Método para insertar un nuevo nodo antes de la cabeza de la lista
    public void insertarAntesDeCabeza(int dato) {
        Nodo nuevoNodo = new Nodo(dato);

        // Si la lista está vacía, el nuevo nodo se convierte en la cabeza y la cola
        if (cabeza == null) {
            cabeza = cola = nuevoNodo;
            cabeza.anterior = null;
            cola.siguiente = null;
        } else {
            // Si la lista no está vacía, se enlaza el nuevo nodo antes de la cabeza actual
            cabeza.anterior = nuevoNodo;
            nuevoNodo.siguiente = cabeza;
            cabeza = nuevoNodo;
            cabeza.anterior = null;
        }
    }

    // Método para imprimir los nodos de la lista desde la cabeza hasta la cola
    public void imprimirCabezaCola() {
        Nodo actual = cabeza;

        if (cabeza == null) {
            System.out.println("  Lista vacía");
            return;
        }

        System.out.println("  Nodos de cabeza a cola:");
        while (actual != null) {
            System.out.print("  [ ");
            System.out.print(actual.dato);
            System.out.print(" ] ");
            actual = actual.siguiente;
        }
    }

    // Método para imprimir los nodos de la lista desde la cola hasta la cabeza
    public void imprimirColaCabeza() {
        Nodo actual = cola;

        if (cabeza == null) {
            System.out.println("  Lista vacía!");
            return;
        }

        System.out.println("  Nodos de cola a cabeza:");
        while (actual != null) {
            System.out.print("  [ ");
            System.out.print(actual.dato);
            System.out.print(" ] ");
            actual = actual.anterior;
        }

        System.out.println("");
    }

    // Método para eliminar un nodo con un valor específico de la lista
    public LDEnlazadas eliminar(LDEnlazadas lista, int clave) {
        Nodo nodoActual = lista.cabeza;

        // Caso especial: si el nodo a eliminar es la cabeza
        if (nodoActual != null && nodoActual.dato == clave) {
            lista.cabeza = nodoActual.siguiente;
            if (lista.cabeza != null) {
                lista.cabeza.anterior = null;
            }

            System.out.print("===========================================================\n");
            System.out.println("  El número " + clave + " ha sido encontrado y eliminado!");
            System.out.print("===========================================================\n");
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

            System.out.print("===========================================================\n");
            System.out.println("  El número " + clave + " ha sido encontrado y eliminado!");
            System.out.print("===========================================================\n");

        } else {
            System.out.print("===========================================================\n");
            System.out.println("  El número " + clave + " no ha sido encontrado!");
            System.out.print("===========================================================\n");
        }

        return lista;
    }

}

// @cbhas
