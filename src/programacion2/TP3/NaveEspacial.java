package programacion2.TP3;

public class NaveEspacial {
    String nombre;
    int combustible;

    public NaveEspacial(String nombre, int combustible) {
        this.nombre = nombre;
        this.combustible = combustible;
    }
    
    public void despegar(){
        System.out.println("Despegué");
    }
    
    public void avanzar(int distancia){
        if(distancia <= combustible){
            combustible -= distancia;
            System.out.println("Avancé " + distancia + " unidades, me quedan " + combustible + " unidades de combustible.");
        } else {
            System.out.println("El combustible no es suficiente para realizar el avance.");
        }
    }
    
    public void recargarCombustible(int recarga){
        combustible += recarga;
        System.out.println("Recargue " + recarga + " de combustible, el total es de " + combustible);
    }

    public String mostrarInfo() {
        return "NaveEspacial{" + "nombre=" + nombre + ", combustible=" + combustible + '}';
    }
    
    
}
