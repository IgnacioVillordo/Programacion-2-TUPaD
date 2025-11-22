package programacion2.TP8.Apartado2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese una edad:");
        int edad = s.nextInt();
        try {
            validarEdad(edad);
        } catch (EdadInvalidadException e) {
            System.err.println("Error al ingresar edad. " + e.getMessage());
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidadException{
        if(edad < 0 || edad > 120){
            throw new EdadInvalidadException("La edad debe ser entre 0 y 120. Edad ingresada " + edad);
        } else {
            System.out.println("Edad correcta.");
        }
    }
}
