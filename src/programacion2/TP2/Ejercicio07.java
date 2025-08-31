package TP2;

import java.util.Scanner;

public class Ejercicio07 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] notas = new int[10];
        for (int i = 0; i < 10; i++) {
            do {
                System.out.println("Ingrese una nota (0-10):");
                notas[i] = s.nextInt();
                if(notas[i] < 0 || notas[i] > 10){
                    System.out.print("Nota inválida.");
                } else {
                    System.out.println("Nota guardada correctamente");
                }
            } while (notas[i] < 0);

        }
    }
}
