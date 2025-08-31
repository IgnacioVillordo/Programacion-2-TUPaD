package TP2;

import java.util.Scanner;

public class Ejercicio11 {
    static double descuento = 0.1;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = s.nextDouble();
        double descuentoEspecial = calcularDescuentoEspecial(precio);
        System.out.println("El descuento especial aplicado es: $" + descuentoEspecial);
        System.out.println("El precio final con descuento es: $" + (precio - descuentoEspecial));
    }
    
    public static double calcularDescuentoEspecial(double precio) {
        return precio * descuento;
    }
}
