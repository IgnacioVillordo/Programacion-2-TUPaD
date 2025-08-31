package TP2;

import java.util.Scanner;

public class Ejercicio08 {
    
    static double precioBase = 0;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el precio base del producto: ");
        precioBase = s.nextDouble();
        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = s.nextDouble()/100;
        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = s.nextDouble()/100;
        double preciofinal = calcularPrecioFinal(impuesto, descuento);
        System.out.println("El precio final del producto es: " + preciofinal);
        
    }

    public static double calcularPrecioFinal(double impuesto, double descuento){
        return precioBase + (precioBase*impuesto) - (precioBase*descuento);
    }
}
