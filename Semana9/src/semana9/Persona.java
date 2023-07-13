package semana9;

public class Persona {

    private String nombre;
    private int edad;

    public Persona(String n, int e) {
        nombre = n;
        edad = e;
    }

    public void cambiarDatos(String n, int e) {
        nombre = n;
        edad = e;
    }

    public void mostrarDatos() {
        System.out.printf("Nombre: %s\nEdad: %d\n", nombre, edad);
    }

}
