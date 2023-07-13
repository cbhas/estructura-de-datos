package semana9;

public class Nodo {

    private int numero;
    Nodo nodo;

    public Nodo() {
        numero = 0;
        nodo = null;
    }

    public Nodo(int nu) {
        numero = nu;
        nodo = null;
    }

    public void concatenarNext(Nodo n) {
        nodo = n;
    }

    public void imprimirNodo() {
        System.out.println("Dato: " + numero + "\nNext: " + nodo);
    }

}
