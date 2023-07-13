package ldenlazadas;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        LDEnlazadas lDE = new LDEnlazadas();

        boolean bandera = true;

        System.out.println("======================================================\n"
                + "             Listas Doblemente Enlazadas\n"
                + "======================================================");
        while (bandera) {
            System.out.print(""
                    + "  Ingrese '1' para insertar datos despues de la cabeza...\n"
                    + "  Ingrese '2' para insertar datos antes de la cabeza...\n"
                    + "  Ingrese '3' para mostrar los datos de cabeza a cola...\n"
                    + "  Ingrese '4' para mostrar los datos de cola a cabeza...\n"
                    + "  Ingresa '5' para eliminar un dato...\n"
                    + "  Ingrese '6' para salir del programa...\n  > ");
            int opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.print("======================================================\n");
                System.out.print("  Ingrese el dato:\n  > ");
                int dato = entrada.nextInt();
                System.out.print("======================================================\n");
                lDE.insertarDespuesDeCabeza(dato);

            } else if (opcion == 2) {
                System.out.print("======================================================\n");
                System.out.print("  Ingrese el dato:\n  > ");
                int dato = entrada.nextInt();
                System.out.print("======================================================\n");
                lDE.insertarAntesDeCabeza(dato);

            } else if (opcion == 3) {
                System.out.print("======================================================\n");
                if (lDE.cabeza == null) {
                    System.out.println("  No hay datos...");
                    System.out.print("======================================================\n");
                } else {
                    lDE.imprimirCabezaCola();
                    System.out.println("");
                    System.out.println("  La cabeza de la siguiente lista es: " + lDE.cabeza.dato);
                    System.out.print("  La cola de la siguiente lista es: " + lDE.cola.dato);
                    System.out.print("\n======================================================\n");
                }

            } else if (opcion == 4) {
                System.out.print("======================================================\n");
                if (lDE.cabeza == null) {
                    System.out.println("  No hay datos...");
                    System.out.print("======================================================\n");
                } else {
                    lDE.imprimirColaCabeza();
                    System.out.print("  La cola de la siguiente lista es: " + lDE.cola.dato);
                    System.out.print("  La cabeza de la siguiente lista es: " + lDE.cabeza.dato);
                    System.out.print("\n======================================================\n");
                }

            } else if (opcion == 5) {
                System.out.print("======================================================\n");
                if (lDE.cabeza == null) {
                    System.out.println("  No hay datos para eliminar...");
                    System.out.print("======================================================\n");
                } else {
                    System.out.print("  Ingrese el dato a eliminar:\n  > ");
                    int dato = entrada.nextInt();
                    lDE.eliminar(lDE, dato);
                }

            } else if (opcion == 6) {
                System.out.println("======================================================");
                System.out.println("  Hasta la próxima!");
                System.out.println("======================================================");
                bandera = false;

            } else {
                System.out.println("======================================================");
                System.out.println("  Opción Incorrecta!!");
                System.out.println("======================================================");
                return;
            }

        }

    }

}

// @cbhas
