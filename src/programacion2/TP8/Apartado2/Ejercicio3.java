package programacion2.TP8.Apartado2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try{
            String ruta = "texto.txt";
            File archivo = new File(ruta);
            Scanner lector = new Scanner(archivo);
            // 3. Iterar sobre el archivo línea por línea y mostrarlo
            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }

            lector.close();
        } catch (FileNotFoundException e){
            System.err.println("El archivo no se encuentra " + e.getMessage());
        }
    }
}
