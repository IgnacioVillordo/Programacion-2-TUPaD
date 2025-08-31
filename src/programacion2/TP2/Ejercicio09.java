package TP2;

import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = s.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = s.nextDouble();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        s.nextLine();
        String zona = s.nextLine();
        System.out.println("El costo de envío es: $" + calcularCostoEnvio(peso, zona));
        System.out.println("El total a pagar es: $" + calcularTotalCompra(precioProducto, calcularCostoEnvio(peso, zona)));
    }

    public static double calcularCostoEnvio(double peso, String zona) {
        return peso * (zona == "Internacional" ? 10 : 5);
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio){
        return precioProducto + costoEnvio;
    }
}
