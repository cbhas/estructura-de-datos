package semanaseis;

import java.util.Scanner;

public class Metodo {

    public static int[][] crearAB() {
        Scanner entrada = new Scanner(System.in);

        try {
            System.out.print("Ingrese el tamaño de la matriz:\n> ");
            int tamanio = entrada.nextInt();

            int matriz[][] = new int[tamanio][tamanio];
            for (int i = 0; i < matriz.length; i++) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.printf("Ingrese el valor en la posición [%d][%d]:\n> ", i, j);
                    matriz[i][j] = entrada.nextInt();
                }
            }

            return matriz;

        } catch (Error e) {
            System.out.println("Error de datos!!");
        } finally {
            entrada.close();
        }
        return null;
    }

    public static void presentarAB(int[][] matriz) {

        System.out.println("\nMatriz");

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("%d ", matriz[i][j]);
            }
            System.out.println(" ");
        }
        System.out.println("");
    }

    public static void numeroMayor(int[][] matriz) {

        int fila = 0;
        int columna = 0;
        int numero = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (numero < matriz[i][j]) {
                    numero = matriz[i][j];
                    fila = i;
                    columna = j;
                }
            }
        }
        System.out.printf("El número mayor es %d y se encuentra en la fila [%d] y columna [%d]\n", numero, fila, columna);
    }
}
