package TP2;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese su edad:");
        int edad = s.nextInt();
        
        if(edad < 12){
            System.out.println("Niño");
        } else if(edad >= 12 && edad <= 17){
            System.out.println("Adolescente");
        } else if(edad >= 18 && edad <= 59){
            System.out.println("Adulto");
        } else {
            System.out.println("Adulto mayor");
        }
    }
}
