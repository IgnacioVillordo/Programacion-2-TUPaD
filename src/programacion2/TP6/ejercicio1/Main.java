package programacion2.TP6.ejercicio1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto("1", "Gaseosa", 2500, 1000, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("2", "Heladera", 500000, 10, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("3", "Camisa", 25000, 10, CategoriaProducto.ROPA);
        Producto p4 = new Producto("4", "Smartphone", 350000, 10, CategoriaProducto.ELECTRONICA);
        Producto p5 = new Producto("5", "Sommier", 250000, 10, CategoriaProducto.HOGAR);
        Inventario inventario = new Inventario();
        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);
        
        for(Producto p : inventario.productos){
            System.out.println(p.mostrarInfo());
        }
        
        System.out.println(inventario.buscarProductoPorId("3").mostrarInfo());
        
        inventario.listarProductos();
        
        inventario.eliminarProducto("3");
        inventario.listarProductos();
        
        inventario.actualizarStock("1", 300);
        
        System.out.println(inventario.obtenerTotalStock());
        
        System.out.println(inventario.obtenerProductoConMayorStock().mostrarInfo());
        
        ArrayList<Producto> precios = inventario.filtrarProductosPorPrecio(1000, 3000);
        for(Producto p : precios){
            System.out.println(p.mostrarInfo());
        }
        
        CategoriaProducto[] categoriaProductos = CategoriaProducto.values();
        for(CategoriaProducto c : categoriaProductos){
            System.out.println(c.mostrarInfo());
        }
    }
}
