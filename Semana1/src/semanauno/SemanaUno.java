package semanauno;

import java.io.*;

public class SemanaUno {

    public static void main(String[] args) {

        // Crear el Archivo
        try {
            File file = new File("C:\\Users\\SALA A\\Desktop\\edd\\"
                    + "Estructura-de-Datos\\SemanaUno\\src\\semana1.txt");
            if (file.createNewFile()) {
                System.out.println("Archivo creado: " + file.getName());
            } else {
                System.out.println("El archivo existe");
            }
        } catch (IOException e) {
            System.out.println("Erorr");
        }

        // Escribir un Archivo
        try (FileWriter myWriter = new FileWriter("C:\\Users\\SALA A\\Desktop\\"
                + "edd\\Estructura-de-Datos\\SemanaUno\\src\\semana1.txt",
                true)) {
            myWriter.write("Ejemplo1 de escritura en archivo usando Write\n");
            System.out.println("El archivo ha sido creado");
        } catch (IOException e) {
            System.out.println("Error de escritura");
        }

        // Leer un Archivo
        System.out.println("\nLeemos el archivo: ");
        try (FileReader myReader = new FileReader("C:\\Users\\SALA A\\Desktop\\"
                + "edd\\Estructura-de-Datos\\SemanaUno\\src\\semana1.txt")) {
            int i;
            while ((i = myReader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            System.out.println("Error de lectura" + e);
        }

        //Agregar línea a un Archivo
        try (FileWriter myWriter = new FileWriter("C:\\Users\\SALA A\\Desktop\\"
                + "edd\\Estructura-de-Datos\\SemanaUno\\src\\semana1.txt",
                true)) {
            myWriter.write("Ejemplo2 de escritura en archivo usando Write\n");
            myWriter.write("Ejemplo3 de escritura en archivo usando Write\n");
            myWriter.append("Ejemplo4 de escritura en archivo usando Write y append\n").append("Hola\n");
            myWriter.write("Ejemplo5 de escritura en archivo usando Write\n");
            myWriter.close();
            System.out.println("Archivo escrito");
        } catch (IOException e) {
            System.out.println("Error de lectura" + e);
        }
    }
}
