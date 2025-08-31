package TP2;

public class Ejercicio13 {
    public static void main(String[] args) {
        double[] precios = new double[5];
        precios[0] = 199.99;
        precios[1] = 299.5;
        precios[2] = 149.75;
        precios[3] = 399.0;
        precios[4] = 89.99;
        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        imprimirRecursivo(precios, 0);
    }
    
    static void imprimirRecursivo(double[] precios, int index){
        if(index == precios.length){
            return;
        }
        
        System.out.println("Precio: $" + precios[index]);
        imprimirRecursivo(precios, index + 1);
    }
}
