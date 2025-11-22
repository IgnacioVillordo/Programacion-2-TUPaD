package programacion2.TP8.Apartado1;

import java.util.LinkedList;
import java.util.List;

public class Pedido implements Pagable{
    List<Producto> productos;
    private Estado estado;
    private Cliente cliente;

    public Pedido(){
        this.productos = new LinkedList<>();
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total += productos.get(i).getPrecio();
        }
        return total;
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente(){
        return this.cliente;
    }

    public void cambiarEstado(Estado estado){
        this.estado = estado;
    }

    public void finalizarPago(Pago medioDePago){
        double total = calcularTotal();
        System.out.println("Total del pedido: $" + total);

        double pago = medioDePago.procesarPago(total);
        System.out.println("Total a pagar: $" + pago);

        cambiarEstado(Estado.PAGADO);

    }


}
