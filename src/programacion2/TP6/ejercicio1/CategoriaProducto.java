package programacion2.TP6.ejercicio1;

enum CategoriaProducto {
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electr�nicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Art�culos para el hogar");

    private final String descripcion;

    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public String mostrarInfo(){
        return this + " (" + this.getDescripcion() + ")";
    }
}
