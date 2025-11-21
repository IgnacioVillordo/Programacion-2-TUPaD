package programacion2.TP7.Apartado3;

public class EmpleadoTemporal extends Empleado{
    private String nombre;
    private int horas;
    private double valorHora;

    public EmpleadoTemporal(String nombre, int horas, double valorHora) {
        this.nombre = nombre;
        this.horas = horas;
        this.valorHora = valorHora;
    }

    @Override
    double calcularSueldo() {
        return this.horas * this.valorHora;
    }

    @Override
    String getNombre() {
        return this.nombre;
    }

    
    
    
}
