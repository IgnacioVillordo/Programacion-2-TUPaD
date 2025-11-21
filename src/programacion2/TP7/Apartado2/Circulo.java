package programacion2.TP7.Apartado2;

public class Circulo extends Figura{
    
    private double radio;

    public Circulo(double radio, String nombre) {
        this.radio = radio;
        this.nombre = nombre;
    }
    
    @Override
    void calcularArea() {
        System.out.println("Área del círculo = " + (Math.PI * Math.pow(radio, 2)));
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    
}
