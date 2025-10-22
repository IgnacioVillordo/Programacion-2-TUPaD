package programacion2.TP6.ejercicio1;

import java.util.ArrayList;

public class Inventario {

    ArrayList<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        for (Producto p : productos) {
            System.out.println(p.mostrarInfo());
        }
    }
    
    public Producto buscarProductoPorId(String id){
        for(Producto p : productos){
            if(p.getId() == id){
                return p;
            }
        }
        return null;
    }
    
    public void eliminarProducto(String id){
        productos.remove(buscarProductoPorId(id));
    }
    
    public void actualizarStock(String id, int nuevaCantidad){
        buscarProductoPorId(id).setCantidad(nuevaCantidad);
    }
    
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria){
        ArrayList<Producto> aux = new ArrayList<>();
        for(Producto p : productos){
            if(p.getCategoriaProducto() == categoria){
                aux.add(p);
            } 
        }
        return aux;
    }
    
    public int obtenerTotalStock(){
        int suma = 0;
        for(Producto p : productos){
            suma += p.getCantidad();
        }
        return suma;
    }
    
    public Producto obtenerProductoConMayorStock(){
        Producto max = productos.getFirst();
        for(Producto p : productos){
            if(max.getCantidad() < p.getCantidad()){
                max = p;
            }
        }
        return max;
    }
    
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max){
        ArrayList<Producto> aux = new ArrayList<>();
        for(Producto p : productos){
            if(p.getPrecio() >= min && p.getPrecio() <=max){
                aux.add(p);
            }
        }
        return aux;
    }
    
    public String mostrarCategoriasDisponibles(){
        return CategoriaProducto.values().toString();
    }
}
