package programacion2.TP8;

import java.util.List;

public class Pedido implements Pagable{
    List<Producto> productos;


    @Override
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total += productos.get(i).getPrecio();
        }
        return total;
    }
}
