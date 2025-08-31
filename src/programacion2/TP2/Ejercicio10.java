package TP2;

import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = s.nextInt();
        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = s.nextInt();
        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = s.nextInt();
        System.out.println("El nuevo stock del producto es: " + actualizarStock(stockActual, cantidadVendida, cantidadRecibida) );
    }
    
    static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida){
        return stockActual - cantidadVendida + cantidadRecibida;
    }
}
