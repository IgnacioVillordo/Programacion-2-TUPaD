package TP2;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese un a�o:");
        int anio = s.nextInt();
        if((anio % 4 == 0 && anio % 100 != 0) || (anio % 100 == 0 && anio % 400 == 0)){
            System.out.println("El a�o " + anio + " es bisiesto.");
        } else {
            System.out.println("El a�o " + anio + " no es bisiesto.");
        }
    }
}
