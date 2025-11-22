package programacion2.TP8.Apartado2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        try {
            String text = s.nextLine();
            int num = Integer.parseInt(text);
            System.out.println("Número casteado " + num);
        } catch (NumberFormatException e){
            System.err.println("No se puede convertir texto a número");
        }
    }
}
