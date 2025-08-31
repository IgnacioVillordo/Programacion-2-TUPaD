package TP2;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese un número:");
        int num1 = s.nextInt();
        System.out.print("Ingrese un número:");
        int num2 = s.nextInt();
        System.out.print("Ingrese un número:");
        int num3 = s.nextInt();
        
        int mayor = num1;
        if(num2 > mayor){
            mayor = num2;
        }
        if(num3 > mayor){
            mayor = num3;
        }
        System.out.println("El mayor es " + mayor);
    }
}
