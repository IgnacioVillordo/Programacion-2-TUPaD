package programacion2.TP7.Apartado2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> arreglo = new ArrayList();
        
        Circulo circulo = new Circulo(4, "Circulo");
        Rectangulo rectangulo = new Rectangulo(3, 5, "Rectangulo");
        arreglo.add(circulo);
        arreglo.add(rectangulo);
        
        arreglo.forEach((t) -> {
            t.calcularArea();
        });
        
    }
}
