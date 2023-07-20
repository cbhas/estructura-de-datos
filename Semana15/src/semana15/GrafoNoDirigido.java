package semana15;

import java.util.ArrayList;
import java.util.List;

public class GrafoNoDirigido {

    private int numNodos;
    private List<List<Integer>> adyacencia;

    public GrafoNoDirigido(int numNodos) {
        this.numNodos = numNodos;
        this.adyacencia = new ArrayList<>();

        for (int i = 0; i < numNodos; i++) {
            adyacencia.add(new ArrayList<>());
        }
    }

    public void agregarArista(int origen, int destino) {
        adyacencia.get(origen).add(destino);
        adyacencia.get(destino).add(origen);
    }

    public List<List<Integer>> obtenerAdyacencia() {
        return adyacencia;
    }

    public List<Integer> obtenerAdyacentes(int nodo) {
        return adyacencia.get(nodo);
    }
}

// @cbhas
