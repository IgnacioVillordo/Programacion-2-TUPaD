package TP2;

import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el precio:");
        double precio = s.nextDouble();
        String categoria;
        do {
            System.out.print("Ingrese la categoría (A, B o C):");
            categoria = s.nextLine();
        } while (!(categoria.equalsIgnoreCase("A") || categoria.equalsIgnoreCase("B") || categoria.equalsIgnoreCase("C")));
        System.out.println("El precio original del producto es $" + precio + ".");
        System.out.println("Es de categoría " + categoria);
        int descuento = categoria.equalsIgnoreCase("A") ? 10 : categoria.equalsIgnoreCase("B") ? 15 : 20;
        System.out.println("Descuento aplicado " + descuento + "%");
        System.out.println("El precio final es de $" + (precio - (precio/100*20)));
    }
}
