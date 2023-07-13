package ejercicio;

public class Persona {

    private String nombre;
    private String cedula;
    private String tipo;
    private Persona amigo;

    public Persona(String n, String c, String t) {
        nombre = n;
        cedula = c;
        tipo = t;
    }

    public void establecerNombre(String n) {
        nombre = n;
    }

    public void establecerCedula(String c) {
        cedula = c;
    }

    public void establecerTipo(String t) {
        tipo = t;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerCedula() {
        return cedula;
    }

    public String obtenerTipo() {
        return tipo;
    }

    public Persona obtenerAmigo() {
        return amigo;
    }

    public void concatenarAmigo(Persona p) {
        amigo = p;
    }

    public String mostrarDatos() {
        String mensaje = String.format("""            
                          ============================================
                            Nombre: %s
                            Cédula: %s
                            Tipo: %s
                            Tengo Amigos? - %s
                          ============================================""",
                nombre,
                cedula,
                tipo,
                amigo);
        return mensaje;
    }

}
