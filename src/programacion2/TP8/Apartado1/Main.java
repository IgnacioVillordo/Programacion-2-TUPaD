package programacion2.TP8.Apartado1;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Ignacio");

        Producto p1 = new Producto("Telefono", 300);
        Producto p2 = new Producto("Auriculares", 80);

        Pedido pedido = new Pedido();
        pedido.setCliente(c1);

        pedido.agregarProducto(p1);
        pedido.agregarProducto(p2);


        TarjetaCredito t1 = new TarjetaCredito();
        pedido.finalizarPago(t1);

    }
}
