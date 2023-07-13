package lscircular;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        LSCircular lSC = new LSCircular();

        boolean bandera = true;

        System.out.println("======================================================\n"
                + "             Lista Simplemente Circular\n"
                + "======================================================");
        while (bandera) {
            System.out.print("  Ingrese '1' para insertar datos...\n"
                    + "  Ingrese '2' para mostrar los datos...\n"
                    + "  Ingresa '3' para eliminar un dato...\n"
                    + "  Ingrese '4' para salir del programa...\n  > ");
            int opcion = entrada.nextInt();

            if (opcion == 1) {
                System.out.print("======================================================\n");
                System.out.print("  Ingrese el dato:\n  > ");
                int dato = entrada.nextInt();
                System.out.print("======================================================\n");
                lSC.agregar(dato);

            } else if (opcion == 2) {
                System.out.print("======================================================\n");
                if (lSC.cabeza == null) {
                    System.out.println("  No hay datos...");
                    System.out.print("======================================================\n");

                } else {
                    lSC.imprimir();
                    System.out.println("  La cabeza de la siguiente lista es: " + lSC.cabeza.dato);
                    System.out.print("  La cola de la siguiente lista es: " + lSC.cola.dato);
                    System.out.print("\n======================================================\n");
                }

            } else if (opcion == 3) {
                System.out.print("======================================================\n");
                if (lSC.cabeza == null) {
                    System.out.println("  No hay datos para eliminar...");
                    System.out.print("======================================================\n");

                } else {
                    System.out.print("  Ingrese el dato a eliminar:\n  > ");
                    int dato = entrada.nextInt();
                    lSC.eliminar(dato);
                }

            } else if (opcion == 4) {
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
