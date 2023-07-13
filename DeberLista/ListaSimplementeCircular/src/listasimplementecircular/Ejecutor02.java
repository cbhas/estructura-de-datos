package listasimplementecircular;

public class Ejecutor02 {

    public static void main(String[] args) {
        LSCircular lSC = new LSCircular();

        lSC.agregar(2);
        lSC.agregar(3);
        lSC.agregar(4);
        
        System.out.print("=====================================================\n");
        System.out.println("  " + lSC.cabeza);
        System.out.println("  " + lSC.cabeza.siguiente);
        System.out.println("  " + lSC.cabeza.siguiente.siguiente);
        System.out.println("  " + lSC.cola);
        System.out.println("  " + lSC.cola.siguiente);
        System.out.print("=====================================================\n");

        lSC.imprimir();
        lSC.eliminar(4);
        lSC.imprimir();
        
        System.out.print("=====================================================\n");
        System.out.println("  " + lSC.cabeza);
        System.out.println("  " + lSC.cabeza.siguiente);
        System.out.println("  " + lSC.cola);
        System.out.println("  " + lSC.cola.siguiente);
        System.out.print("=====================================================\n");
    }

}

// @cbhas
