package listasdoblementecircular;

public class Ejecutor02 {

    public static void main(String[] args) {
        LDCircular lDC = new LDCircular();

        lDC.insertar(1);
        lDC.insertar(2);
        lDC.insertar(3);
        lDC.insertar(4);
        
        System.out.print("=====================================================\n");
        System.out.println("  " + lDC.cabeza);
        System.out.println("  " + lDC.cabeza.siguiente);
        System.out.println("  " + lDC.cabeza.siguiente.siguiente);
        System.out.println("  " + lDC.cola);
        System.out.println("  " + lDC.cola.siguiente);
        System.out.print("=====================================================\n");
        System.out.println("  " + lDC.cola);
        System.out.println("  " + lDC.cola.anterior);
        System.out.println("  " + lDC.cola.anterior.anterior);
        System.out.println("  " + lDC.cabeza);
        System.out.println("  " + lDC.cabeza.anterior);
        System.out.print("=====================================================\n");

        lDC.imprimir();
        lDC.eliminar(lDC, 4);
        lDC.imprimir();

        System.out.print("=====================================================\n");
        System.out.println("  " + lDC.cabeza);
        System.out.println("  " + lDC.cabeza.siguiente);
        System.out.println("  " + lDC.cola);
        System.out.println("  " + lDC.cola.siguiente);
        System.out.print("=====================================================\n");
        System.out.println("  " + lDC.cola);
        System.out.println("  " + lDC.cola.anterior);
        System.out.println("  " + lDC.cabeza);
        System.out.println("  " + lDC.cabeza.anterior);
        System.out.print("=====================================================\n");
    }

}

// @cbhas
