package semana15;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Ejecutor {

    public static void main(String[] args) {
        GrafoNoDirigido grafo = new GrafoNoDirigido(6);

        grafo.agregarArista(0, 1);
        grafo.agregarArista(0, 2);
        grafo.agregarArista(0, 3);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(1, 4);
        grafo.agregarArista(2, 4);
        grafo.agregarArista(4, 5);
        grafo.agregarArista(3, 5);

        System.out.println("Nodos del Grafo");
        recorridoEnAnchura(grafo.obtenerAdyacencia(), 0);

        for (int i = 0; i < 6; i++) {
            List<Integer> adyacentes = grafo.obtenerAdyacentes(i);
            System.out.printf("\n\nNodos adyacentes al nodo %d:", i);
            for (Integer nodo : adyacentes) {
                System.out.print(" (" + nodo + ") ");
            }

            System.out.println("");
        }

    }

    public static void recorridoEnAnchura(List<List<Integer>> grafo, int nodoInicial) {
        boolean[] visitados = new boolean[grafo.size()];
        Queue<Integer> cola = new LinkedList<>();

        visitados[nodoInicial] = true;
        cola.offer(nodoInicial);

        while (!cola.isEmpty()) {
            int nodoActual = cola.poll();
            System.out.print(" (" + nodoActual + ") ");

            for (int adyacente : grafo.get(nodoActual)) {
                if (!visitados[adyacente]) {
                    visitados[adyacente] = true;
                    cola.offer(adyacente);
                }

            }

        }

    }

}

// @cbhas
