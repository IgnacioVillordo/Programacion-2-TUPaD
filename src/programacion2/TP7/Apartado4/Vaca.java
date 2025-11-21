package programacion2.TP7.Apartado4;

public class Vaca extends Animal{
    private String nombre;

    public Vaca(String nombre) {
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
        System.out.println("Muuu!");
    }

    @Override
    void describirAnimal() {
        System.out.println("Soy grande, como pasto, y doy leche.");
    }
    
    
}
