package semanacinco;

public class Burbuja {

    public static void main(String[] args) {
        int[] arreglo = {10, 11, 21, 5, 1};
        arreglo = burbuja(arreglo);
        for (int elemento : arreglo) {
            System.out.println(elemento);
        }
    }

    public static int[] burbuja(int[] array) {
        int aux;
        int[] arrayOrdenado;

        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        arrayOrdenado = array;
        return arrayOrdenado;
    }

}
