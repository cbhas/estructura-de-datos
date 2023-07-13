package pila;

import java.util.Scanner;

public class PilaArray {

    Scanner entrada = new Scanner(System.in);

    int[] pila;
    int tope;
    int max;

    public PilaArray(int max) {
        this.tope = -1;
        this.max = max;
        this.pila = new int[max];
    }

    public int getTope() {
        return tope;
    }

    public void vaciarPila() {
        this.tope = -1;
    }

    public boolean pilaLlena() {
        return this.max - 1 == this.tope;
    }

    public boolean pilaVacia() {
        return this.tope == -1;
    }

    public void insertarPila() {
        if (this.pilaLlena()) {
            System.out.println("Pila Llena");
        } else {
            int item;
            System.out.print("Ingrese item a insertar:\n> ");
            item = entrada.nextInt();
            this.tope++;
            this.pila[this.tope] = item;
            System.out.println("El item " + item + " se ha insertado.");
        }
    }

    public void eliminarPila() {
        if (this.pilaVacia()) {
            System.out.println("Pila Vacía");
        } else {
            int item = this.pila[this.tope];
            this.tope--;
            System.out.println("El item " + item + " se ha eliminado.");
        }
    }

    public void imprimirPila() {
        if (this.pilaVacia()) {
            System.out.println("Pila Vacía");
        } else {
            for (int i = 0; i < this.tope; i++) {
                System.out.println(pila[i]);
            }
        }
    }

    public void mostrarPila() {
        if (this.pilaVacia()) {
            System.out.println("Pila Vacía");
        } else {
            String mensaje = "";
            for (int i = 0; i <= this.tope; i++) {
                mensaje = mensaje + this.pila[i] + "\n";
            }
            System.out.println(mensaje);
        }
    }

}
