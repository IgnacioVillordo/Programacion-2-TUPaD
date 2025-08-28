package programacion2.TP1;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        String nombre = "";
        int edad = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre = s.nextLine();
        System.out.println("Ingrese su edad:");
        edad = s.nextInt();
        System.out.println("Hola " + nombre + " tienes " + edad + " años." );
    }
}
