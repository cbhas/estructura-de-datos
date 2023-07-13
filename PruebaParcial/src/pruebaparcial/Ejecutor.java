package pruebaparcial;

import java.util.Scanner;

public class Ejecutor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        LDEWord lDE = new LDEWord();

        boolean bandera = true;
        boolean bandera1 = true;

        while (bandera) {

            System.out.println("===========================================================\n"
                    + "                 Microsoft Word \n"
                    + "===========================================================");

            System.out.print(""
                    + "  Ingrese '1' para insertar la oración...\n"
                    + "  Ingrese '2' para corregir una palabra...\n"
                    + "  Ingrese '3' para mostrar la oración de inicio a fin...\n"
                    + "  Ingrese '4' para mostrar la oración de fin a inicio...\n"
                    + "  Ingresa '5' para eliminar un dato...\n"
                    + "  Ingrese '6' para salir del programa...\n  > ");
            String opcion = entrada.nextLine();

            if ("1".equals(opcion)) {
                int contador = 1;
                while (bandera1) {
                    System.out.print("===========================================================\n");
                    System.out.print("  Ingrese la " + contador + " 'palabra' o 'caracter' de la oración:\n  > ");
                    String dato = entrada.nextLine();
                    System.out.print("===========================================================\n");
                    lDE.insertarDespuesDeCabeza(dato);
                    contador++;
                    
                    System.out.print("\n===========================================================");
                    System.out.print("\n  Si desea dejar de ingresar otra 'palabra' o 'caracter' ingrese 'si':\n  > ");
                    opcion = entrada.nextLine();

                    if ("si".equals(opcion)) {
                        bandera1 = false;
                    }
                }

            } else if ("2".equals(opcion)) {
                System.out.print("===========================================================\n");
                System.out.print("  Ingrese la palabra que desea corregir:\n  > ");
                String dato = entrada.nextLine();
                System.out.print("===========================================================\n");
                lDE.reemplazar(lDE, dato);

            } else if ("3".equals(opcion)) {
                System.out.print("===========================================================\n");
                if (lDE.cabeza == null) {
                    System.out.println("  No hay datos a mostrar...");
                    
                } else {
                    System.out.println("  La cabeza de la siguiente lista es: " + lDE.cabeza.dato);
                    System.out.println("  La cola de la siguiente lista es: " + lDE.cola.dato + "\n");
                    lDE.imprimirCabezaCola();
                    System.out.println("");
                }

            } else if ("4".equals(opcion)) {
                System.out.print("===========================================================\n");
                if (lDE.cabeza == null) {
                    System.out.println("  No hay datos a mostrar...");
                    
                } else {
                    System.out.println("  La cabeza de la siguiente lista es: " + lDE.cola.dato);
                    System.out.println("  La cola de la siguiente lista es: " + lDE.cabeza.dato + "\n");
                    lDE.imprimirColaCabeza();
                    System.out.print("");
                }

            } else if ("5".equals(opcion)) {
                System.out.print("===========================================================\n");
                if (lDE.cabeza == null) {
                    System.out.println("  No hay datos para eliminar...");
                } else {
                    System.out.print("  Ingrese el dato a eliminar:\n  > ");
                    String dato = entrada.nextLine();
                    lDE.eliminar(lDE, dato);
                }

            } else if ("6".equals(opcion)) {
                System.out.println("===========================================================");
                System.out.println("  Hasta la próxima!");
                System.out.println("===========================================================");
                bandera = false;

            } else {
                System.out.println("===========================================================");
                System.out.println("  Opción Incorrecta!!");
                System.out.println("===========================================================");
                return;
            }

        }

    }
}

// @cbhas
