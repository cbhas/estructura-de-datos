package listasdoblementeenlazadas;

public class Main {

    public static void main(String[] args) {
        ListasDoblementeEnlazadas dE = new ListasDoblementeEnlazadas();

        dE.insertDespuesCabeza(5);
        dE.insertDespuesCabeza(2);
        dE.insertDespuesCabeza(3);
        dE.insertDespuesCabeza(14);
        dE.insertDespuesCabeza(1);

        dE.printInicioFin();
        System.out.println("");
        dE.printFinInicio();
    }

}
