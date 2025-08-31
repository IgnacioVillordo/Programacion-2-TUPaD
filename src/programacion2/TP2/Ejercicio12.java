package TP2;

public class Ejercicio12 {

    public static void main(String[] args) {
        double[] precios = new double[5];
        precios[0] = 199.99;
        precios[1] = 299.5;
        precios[2] = 149.75;
        precios[3] = 399.0;
        precios[4] = 89.99;
        System.out.println("Precios originales:");
        for(double d : precios){
            System.out.println("Precio: $" + d);
        }
        precios[2] = 129.99;
        System.out.println("Precios modificados:z");
        for(double d : precios){
            System.out.println("Preico: $" + d);
        }
    }
}
