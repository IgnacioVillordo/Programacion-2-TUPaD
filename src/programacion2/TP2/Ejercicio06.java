package TP2;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int pos = 0, neg = 0 , cero = 0, num = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            num = s.nextInt();
            if(num > 0){
                pos++;
            } else if (num < 0){
                neg++;
            } else {
                cero++;
            }
        }
        System.out.println("Ingreso " + pos + " números positivos, " + neg + " números negativos y " + cero + " cero");
    }
}
