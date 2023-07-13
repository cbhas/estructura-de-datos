package pruebaparcial;

import java.util.Scanner;

public class LDEWord {

    class Nodo {

        String dato;
        Nodo anterior;
        Nodo siguiente;

        public Nodo(String d) {
            dato = d;
        }

    }

    Nodo cabeza = null;
    Nodo cola = null;

    public void insertarDespuesDeCabeza(String dato) {
        Nodo nuevoNodo = new Nodo(dato);

        if (cabeza == null) {
            cabeza = cola = nuevoNodo;
            cabeza.anterior = null;
            cola.siguiente = null;

        } else {
            cola.siguiente = nuevoNodo;
            nuevoNodo.anterior = cola;
            cola = nuevoNodo;
            cola.siguiente = null;
        }

        Nodo actual = cabeza;

        if (cabeza == null) {
            System.out.println("  Lista vacía");
            return;
        }

        System.out.println("  La oración hasta el momento es:");

        while (actual != null) {
            System.out.print("  " + actual.dato + " ");
            actual = actual.siguiente;
        }

    }

    public void imprimirCabezaCola() {
        Nodo actual = cabeza;

        if (cabeza == null) {
            System.out.println("  Lista vacía");
            return;
        }

        System.out.println("  La oración de inicio a fin es:");

        while (actual != null) {
            System.out.print("  " + actual.dato + " ");
            actual = actual.siguiente;
        }

    }

    public void imprimirColaCabeza() {
        Nodo actual = cola;

        if (cabeza == null) {
            System.out.println("  Lista vacía!");
            return;
        }

        System.out.println("  La oración de fin a inicio es:");
        while (actual != null) {
            System.out.print("  " + actual.dato + " ");
            actual = actual.anterior;
        }

        System.out.println("");
    }

    public LDEWord reemplazar(LDEWord lista, String palabra) {
        Scanner entrada = new Scanner(System.in);

        Nodo nuevoNodo = lista.cabeza;

        while (nuevoNodo != null && !nuevoNodo.dato.equals(palabra)) {
            nuevoNodo = nuevoNodo.siguiente;
        }

        if (nuevoNodo == null) {
            System.out.println("  La palabra '" + palabra + "' no ha sido encontrada en la oración!\n");
            return lista;
        }

        System.out.print("  Ingresa tu palabra corregida:\n  > ");
        String nuevaPalabra = entrada.nextLine();

        nuevoNodo.dato = nuevaPalabra;
        System.out.println("\n  La palabra '" + palabra + "' ha sido cambiada por '" + nuevaPalabra + "'");

        return lista;
    }

    public LDEWord eliminar(LDEWord lista, String clave) {
        Nodo nodoActual = lista.cabeza;

        if (nodoActual != null && nodoActual.dato.equals(clave)) {
            lista.cabeza = nodoActual.siguiente;
            if (lista.cabeza != null) {
                lista.cabeza.anterior = null;
            }

            System.out.print("===========================================================\n");
            System.out.println("  La palabra '" + clave + "' ha sido encontrado y eliminado!\n");

            Nodo actual = cabeza;

            System.out.println("  La oración hasta el momento es:");

            while (actual != null) {
                System.out.print("  " + actual.dato + " ");
                actual = actual.siguiente;
            }
            System.out.println("");
            return lista;
        }

        while (nodoActual != null && !nodoActual.dato.equals(clave)) {
            nodoActual = nodoActual.siguiente;
        }

        if (nodoActual != null) {
            Nodo anterior = nodoActual.anterior;
            Nodo siguiente = nodoActual.siguiente;

            if (anterior != null) {
                anterior.siguiente = siguiente;
            }

            if (siguiente != null) {
                siguiente.anterior = anterior;
            }

            System.out.print("===========================================================\n");
            System.out.println("  La palabra '" + clave + "' ha sido encontrado y eliminado!");

            Nodo actual = cabeza;

            System.out.println("  La oración hasta el momento es:");

            while (actual != null) {
                System.out.print("  " + actual.dato + " ");
                actual = actual.siguiente;
            }
            System.out.println("");
            return lista;
        } else {
            System.out.print("===========================================================\n");
            System.out.println("  La palabra '" + clave + "' no ha sido encontrado!");
            System.out.print("===========================================================\n");
            Nodo actual = cabeza;

            System.out.println("  La oración hasta el momento es:");

            while (actual != null) {
                System.out.print("  " + actual.dato + " ");
                actual = actual.siguiente;
            }
            System.out.println("");
            return lista;
        }

    }

}

// @cbhas
