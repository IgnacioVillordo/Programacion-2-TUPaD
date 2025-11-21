package programacion2.TP7.Apartado4;

public class Gato extends Animal{

    String nombre;

    public Gato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @Override
    void hacerSonido() {
        System.out.println("Miau!");
    }

    @Override
    void describirAnimal() {
        System.out.println("Soy flexible, elegante, y me encanta dormir la siesta.");
    }
    
    
    
}
