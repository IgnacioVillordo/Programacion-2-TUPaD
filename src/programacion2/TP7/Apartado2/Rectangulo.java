package programacion2.TP7.Apartado2;

public class Rectangulo extends Figura{

    private double base, altura;

    public Rectangulo(double base, double altura, String nombre) {
        this.base = base;
        this.altura = altura;
        this.nombre = nombre;
    }
    
    @Override
    void calcularArea() {
        System.out.println("Area del rectángulo = " + (base * altura));
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    String getNombre() {
        return nombre;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    
    
}
