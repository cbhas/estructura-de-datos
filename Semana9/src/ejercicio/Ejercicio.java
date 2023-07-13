package ejercicio;

import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador;

        System.out.print("Cuántos personas va a ingresar?\n> ");
        contador = entrada.nextInt();

        Persona[] personas = new Persona[contador];

        for (int i = 0; i < contador; i++) {
            String tipo;

            System.out.print("---------------------------------\n"
                    + " Ingrese 1 si es Estudiante\n"
                    + " Ingrese 2 si es Administrativo\n"
                    + " Ingrese 3 si es Docente\n > ");
            int opcion = entrada.nextInt();
            if (opcion == 1) {
                tipo = "Estudiante";
            } else if (opcion == 2) {
                tipo = "Administrativo";
            } else if (opcion == 3) {
                tipo = "Docente";
            } else {
                System.out.println("Opción Incorrecta!");
                return;
            }
            entrada.nextLine();
            System.out.print("---------------------------------\n Ingrese el nombre:\n > ");
            String nombre = entrada.nextLine();
            System.out.print(" Ingrese la cédula:\n > ");
            String cedula = entrada.nextLine();

            personas[i] = new Persona(nombre, cedula, tipo);

        }

        for (int i = 0; i < contador - 1; i++) {
            personas[i].concatenarAmigo(personas[i + 1]);
        }

        for (int i = 0; i < contador; i++) {
            System.out.println(personas[i].mostrarDatos());
        }

    }

}
