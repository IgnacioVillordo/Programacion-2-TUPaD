package TP2;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int suma = 0, num = 0;
        
        do{
            System.out.print("Ingrese un número (0 para terminar): ");
            num = s.nextInt();
            suma += num;
        } while(num != 0);
        System.out.println("La suma de los números ingresados es: " + suma);
    }
}
