package programacion2.TP8.Apartado2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1, num2;
        System.out.println("Ingrese el primer número");
        num1 = s.nextInt();
        System.out.println("Ingrese el segundo número:");
        num2 = s.nextInt();
        try {
            System.out.println("El resultado es: " + (num1 / num2));
        } catch (ArithmeticException e){
            System.err.println("Error, no se puede dividir por 0");
        }
    }
}
