package listasimplementeenlazada;

public class Ejecutor02 {

    public static void main(String[] args) {
        LSEnlazadas lSE = new LSEnlazadas();
        
        lSE.insertar(lSE, 3);
        lSE.insertar(lSE, 8);
        lSE.insertar(lSE, 1);
        
        System.out.print("======================================================\n");
        System.out.println("  " + lSE.cabeza);
        System.out.println("  " + lSE.cabeza.siguiente);
        System.out.println("  " + lSE.cabeza.siguiente.siguiente);
        System.out.print("======================================================\n");

        lSE.imprimir(lSE);

        lSE.eliminar(lSE, 1);

        lSE.imprimir(lSE);
        
        System.out.print("======================================================\n");
        System.out.println("  " + lSE.cabeza);
        System.out.println("  " + lSE.cabeza.siguiente);
        System.out.print("======================================================\n");
    }

}

// @cbhas
