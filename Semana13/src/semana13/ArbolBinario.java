package semana13;

public class ArbolBinario {
    Nodo raiz;

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
    
    Node root;

    private Node deleteRecursive(Node current, int value) {
        if (current == null) {
            return null;
        }

        if (value == current.value) {
            if (current.left == null && current.right == null) {
                return null;
            }

            if (current.right == null) {
                return current.left;
            }

            if (current.left == null) {
                return current.right;
            }

            int smallestValue = findSmallestValue(current.right);
            current.value = smallestValue;
            current.right = deleteRecursive(current.right, smallestValue);
            return current;
        }

        if (value < current.value) {
            current.left = deleteRecursive(current.left, value);
            return current;
        }

        current.right = deleteRecursive(current.right, value);
        return current;
    }

    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    public void delete(int value) {
        root = deleteRecursive(root, value);
    }

}
