package semana9;

public class MainNodo {

    public static void main(String[] args) {
        Nodo na = new Nodo(8);
        // System.out.println(na);

        Nodo nb = new Nodo(4);
        // System.out.println(nb);

        na.concatenarNext(nb);
        System.out.println("Next A: " + na.nodo);

        Nodo nc = new Nodo(15);
        // System.out.println(nc);
        nb.concatenarNext(nc);
        System.out.println("Next B: " + nb.nodo);
        // nc.imprimirNodo();

        System.out.println("Next C: " + nc.nodo);
    }

}
