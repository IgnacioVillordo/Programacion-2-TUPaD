package programacion2.TP1;

import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        int num1, num2;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        num1 = s.nextInt();
        System.out.println("Ingrese el segundo número: ");
        num2 = s.nextInt();
        System.out.println("Suma = " + (num1 + num2));
        System.out.println("Resta = " + (num1 - num2));
        System.out.println("Multiplicación = " + (num1 * num2));
        System.out.println("División = " + (num1 / num2));  
    }
}
