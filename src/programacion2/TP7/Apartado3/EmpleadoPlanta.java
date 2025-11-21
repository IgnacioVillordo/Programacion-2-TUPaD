package programacion2.TP7.Apartado3;

public class EmpleadoPlanta extends Empleado{
    
    private String nombre;
    private double sueldo, bono;

    public EmpleadoPlanta(String nombre, double sueldo, double bono) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.bono = bono;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getBono() {
        return this.bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }
    
    
    
    @Override
    double calcularSueldo() {
        return this.bono + this.sueldo;
    }
    
}
