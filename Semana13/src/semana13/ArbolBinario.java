package semana13;

public class ArbolBinario {

    Nodo raiz;

    public Nodo agregarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return new Nodo(valor);
        }

        if (valor < actual.valor) {
            actual.izquierdo = agregarRecursivo(actual.izquierdo, valor);

        } else if (valor > actual.valor) {
            actual.derecho = agregarRecursivo(actual.derecho, valor);

        } else {
            System.out.printf("El número (%d) ya existe en el Árbol Binario!\n\n",
                    valor);
            return actual;
        }

        return actual;
    }

    public void agregar(int valor) {
        raiz = agregarRecursivo(raiz, valor);
    }

    private Nodo eliminarRecursivo(Nodo actual, int valor) {
        if (actual == null) {
            return null;

        } else if (valor == actual.valor) {
            if (actual.izquierdo == null && actual.derecho == null) {
                return null;
            }

            if (actual.derecho == null) {
                return actual.izquierdo;
            }

            if (actual.izquierdo == null) {
                return actual.derecho;
            }

            int valorMasPequeño = encontrarValorMasPequeño(actual.derecho);
            actual.valor = valorMasPequeño;
            actual.derecho = eliminarRecursivo(actual.derecho, valorMasPequeño);
            return actual;

        } else if (valor < actual.valor) {
            actual.izquierdo = eliminarRecursivo(actual.izquierdo, valor);
            return actual;

        } else {
            actual.derecho = eliminarRecursivo(actual.derecho, valor);
            return actual;
        }

    }

    private int encontrarValorMasPequeño(Nodo raiz) {
        if (raiz.izquierdo == null) {
            return raiz.valor;

        } else {
            return encontrarValorMasPequeño(raiz.izquierdo);
        }

    }

    public void eliminar(int valor) {
        raiz = eliminarRecursivo(raiz, valor);
        System.out.printf("El número (%d) ha sido eliminado!\n", valor);
    }

    public void recorridoPreOrden(Nodo nodo) {
        if (nodo != null) {
            System.out.printf(" (%d) ", nodo.valor);
            recorridoPreOrden(nodo.izquierdo);
            recorridoPreOrden(nodo.derecho);
        }

    }

    public void recorridoEnOrden(Nodo nodo) {
        if (nodo != null) {
            recorridoEnOrden(nodo.izquierdo);
            System.out.printf(" (%d) ", nodo.valor);
            recorridoEnOrden(nodo.derecho);
        }

    }

    public void recorridoPostOrden(Nodo nodo) {
        if (nodo != null) {
            recorridoPostOrden(nodo.izquierdo);
            recorridoPostOrden(nodo.derecho);
            System.out.printf(" (%d) ", nodo.valor);
        }

    }

}
