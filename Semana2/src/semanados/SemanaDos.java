package semanados;

import java.io.*;

public class SemanaDos {

    public static void main(String[] args) {

        // Escribir el Archivo
        try (FileOutputStream fos = new FileOutputStream("C:\\Users\\SALA A\\"
                + "Desktop\\edd\\Estructura-de-Datos\\SemanaDos\\src\\"
                + "semana2.txt", true)) {
            String data = "Esto es un ejemplo de Stream con bytes\n";
            byte b[] = data.getBytes();
            fos.write(b);
            fos.close();
            System.out.println("Se ha escrito en el archivo");
        } catch (IOException e) {
            System.out.println("Error");
        }

        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\SALA A\\"
                    + "Desktop\\edd\\Estructura-de-Datos\\SemanaDos\\src\\"
                    + "semana2.txt");
            int i;
            while ((i = fis.read()) != -1) {
                System.out.print(i);
            }
        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}
