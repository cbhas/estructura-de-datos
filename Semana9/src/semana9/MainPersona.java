package semana9;

public class MainPersona {

    public static void main(String[] args) {

        Persona personaA;
        Persona personaB;

        personaA = new Persona("Ana", 22);
        personaB = new Persona("Juan", 25);

        System.out.println("personaA" + personaA);
        System.out.println("personaB" + personaB);

        Persona personaC;

        personaC = new Persona("Kevin", 22);

        System.out.println("personaC" + personaC);
        personaC = personaA;
        System.out.println("personaC" + personaC);

        personaA.cambiarDatos("Doris", 25);
        personaA.mostrarDatos();
    }

}
