package ejercicio;

import java.util.Scanner;

public class Cola {

    Scanner entrada = new Scanner(System.in);

    int[] cola;
    int tope;
    int max;

    public Cola(int max) {
        this.tope = -1;
        this.max = max;
        this.cola = new int[max];
    }
    
    
}
