package programacion2.TP7.Apartado4;

public class Perro extends Animal{
    
    String nombre;

    public Perro(String nombre) {
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
        System.out.println("Guau!");
    }

    @Override
    void describirAnimal() {
        System.out.println("Tengo 4 patas y soy el mejor amigo del hombre.");
    }
    
    
}
