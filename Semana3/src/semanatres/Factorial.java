package semanatres;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n;
        System.out.println("Ingresa el número:");
        n = entrada.nextInt();
        int resultado = factorial(n);
        System.out.printf("El factorial de %s es %s\n", n, resultado);
    }

    public static int factorial(int n) {

        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
