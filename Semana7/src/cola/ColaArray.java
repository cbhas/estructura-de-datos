package cola;

import java.util.Scanner;

public class ColaArray {

    Scanner entrada = new Scanner(System.in);

    int[] cola;
    int tope;
    int max;

    public ColaArray(int max) {
        this.tope = -1;
        this.max = max;
        this.cola = new int[max];
    }

    public int getTope() {
        return tope;
    }

    public void vaciarCola() {
        this.tope = -1;
    }

    public boolean colaLlena() {
        return this.max - 1 == this.tope;
    }

    public boolean colaVacia() {
        return this.tope == -1;
    }

    public void insertarCola() {
        if (this.colaLlena()) {
            System.out.println("Pila Llena");
        } else {
            int item;
            int contador = 1;
            this.tope++;
            this.cola[this.tope] = contador;
            System.out.println("El item " + contador + " se ha asiganado.");
        }
    }

    public void eliminarCola() {
        if (this.colaVacia()) {
            System.out.println("Pila Vacía");
        } else {
            int ITEM = this.cola[0];
            System.out.println("El item " + ITEM + " se ha eliminado");
            if (this.tope == 0) {
                vaciarCola();
            } else {

                for (int i = 0; i < this.tope; i++) {
                    this.cola[i] = this.cola[i + 1];
                }
            }
            this.tope--;

        }
    }

    public void imprimirCola() {
        if (this.colaVacia()) {
            System.out.println("Pila Vacía");
        } else {
            for (int i = 0; i < this.tope; i++) {
                System.out.println(cola[i]);
            }
        }
    }

    public void mostrarCola() {
        if (this.colaVacia()) {
            System.out.println("Pila Vacía");
        } else {
            String mensaje = "";
            for (int i = 0; i <= this.tope; i++) {
                mensaje = mensaje + this.cola[i] + "\n";
            }
            System.out.println(mensaje);
        }
    }

}
