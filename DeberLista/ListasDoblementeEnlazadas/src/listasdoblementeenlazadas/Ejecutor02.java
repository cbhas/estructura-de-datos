package listasdoblementeenlazadas;

public class Ejecutor02 {

    public static void main(String[] args) {
        LDEnlazadas lDE = new LDEnlazadas();

        lDE.insertarDespuesDeCabeza(1);
        lDE.insertarDespuesDeCabeza(2);
        lDE.insertarDespuesDeCabeza(3);
        lDE.insertarDespuesDeCabeza(4);

        System.out.print("=======================================================\n");
        System.out.println("  " + lDE.cabeza);
        System.out.println("  " + lDE.cabeza.siguiente);
        System.out.println("  " + lDE.cabeza.siguiente.siguiente);
        System.out.println("  " + lDE.cola);
        System.out.print("=======================================================\n");
        System.out.println("  " + lDE.cola);
        System.out.println("  " + lDE.cola.anterior);
        System.out.println("  " + lDE.cola.anterior.anterior);
        System.out.println("  " + lDE.cabeza);
        System.out.print("=======================================================\n");

        lDE.imprimirCabezaCola();
        System.out.println("");
        lDE.eliminar(lDE, 2);
        lDE.imprimirCabezaCola();
        System.out.println("");

        System.out.print("=======================================================\n");
        System.out.println("  " + lDE.cabeza);
        System.out.println("  " + lDE.cabeza.siguiente);
        System.out.println("  " + lDE.cola);
        System.out.print("=======================================================\n");
        System.out.println("  " + lDE.cola);
        System.out.println("  " + lDE.cola.anterior);
        System.out.println("  " + lDE.cabeza);
        System.out.print("=======================================================\n");
    }
}

// @cbhas
