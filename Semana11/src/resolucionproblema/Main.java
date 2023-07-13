package resolucionproblema;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        ResolucionProblema list = new ResolucionProblema();
        int contadorTicket = 1;
        boolean bandera = true;

        System.out.println("=============================================\n"
                + "            Hospital Isidro Ayora\n"
                + "=============================================");
        while (bandera) {
            System.out.print("  Ingrese '1' para solicitar ticket...\n"
                    + "  Ingrese '2' para marcar como atendido...\n"
                    + "  Ingresa '3' para mostrar los turnos...\n"
                    + "  Ingrese '4' para salir de cola...\n"
                    + "  Ingrese '5' para salir del programa...\n   > ");
            int opcion = entrada.nextInt();

            if (opcion == 1) {
                entrada.nextLine();
                System.out.println("=============================================");
                System.out.print("  Ingrese su nombre y apellido:\n  > ");
                String nombre = entrada.nextLine();
                System.out.print("  Ingrese su cédula:\n  > ");
                String cedula = entrada.nextLine();

                list = list.insertar(list, contadorTicket, nombre, cedula);
                contadorTicket++;
                System.out.println("=============================================");
                System.out.print("  Hola, tú número de ticket es el: " + (contadorTicket - 1) + "\n");
                System.out.println("=============================================");

            } else if (opcion == 2) {
                System.out.println("=============================================");
                if (list.head == null) {
                    System.out.println("  No hay turnos...");
                    
                } else {
                    System.out.print("  La persona con ticket: " + list.head.data + " ha sido atendido/a...\n");
                    list.delete(list, list.head.data);
                    System.out.println("=============================================");
                }

            } else if (opcion == 3) {
                System.out.println("=============================================");
                list.print(list);
                System.out.println("=============================================");

            } else if (opcion == 4) {
                System.out.println("=============================================");
                System.out.print("  Ingrese su número de ticket:\n  > ");
                int numTicket = entrada.nextInt();

                list.delete(list, numTicket);
                System.out.println("=============================================");

            } else if (opcion == 5) {
                System.out.println("=============================================");
                System.out.print("  Hasta la próxima!");
                System.out.println("=============================================");

            } else {
                System.out.println("=============================================");
                System.out.println("  Opción incorrecta!");
                System.out.println("=============================================");
                bandera = false;
            }
        }
    }

}
