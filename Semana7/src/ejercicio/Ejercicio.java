package ejercicio;

import cola.ColaArray;
import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ColaArray cola = new ColaArray(10);
        int opcion;
        boolean bandera = true;

        while (bandera) {
            System.out.println("Ingrese 1, para asignar un ticket\n"
                    + "Ingrese 2, para marcar como atendido\n"
                    + "Ingerse 3, para mostrar la lista de tickets\n"
                    + "Ingrese 4, para salir.\n");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1 -> cola.insertarCola();
                case 2 -> cola.eliminarCola();
                case 3 -> cola.imprimirCola();
                case 4 -> bandera = false;
                default -> {
                    System.out.println("Opcion incorrecta!!");
                    bandera = false;
                }
            }

        }
    }

}
