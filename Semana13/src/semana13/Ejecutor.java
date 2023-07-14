package semana13;

public class Ejecutor {

    public static void main(String[] args) {
        ArbolBinario aB = new ArbolBinario();

        aB.agregar(30);
        aB.agregar(40);
        aB.agregar(35);
        aB.agregar(35);
        aB.agregar(50);
        aB.agregar(60);
        aB.agregar(20);
        aB.agregar(10);
        aB.agregar(25);

        System.out.println("Recorrido PreOrden");
        aB.recorridoPreOrden(aB.raiz);
        System.out.println("\n\nRecorrido EnOrden");
        aB.recorridoEnOrden(aB.raiz);
        System.out.println("\n\nRecorrido PostOrden");
        aB.recorridoPostOrden(aB.raiz);
        System.out.println("\n");

        aB.eliminar(30);
        aB.eliminar(10);
        aB.eliminar(50);

        System.out.println("\nRecorrido PreOrden");
        aB.recorridoPreOrden(aB.raiz);
        System.out.println("\n\nRecorrido EnOrden");
        aB.recorridoEnOrden(aB.raiz);
        System.out.println("\n\nRecorrido PostOrden");
        aB.recorridoPostOrden(aB.raiz);
        System.out.println("");
    }

}
