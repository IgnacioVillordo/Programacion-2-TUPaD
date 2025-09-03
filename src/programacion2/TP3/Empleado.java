package programacion2.TP3;

public class Empleado {
    int id;
    String nombre;
    String puesto;
    double salario;
    static int totalEmpleados;

    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }
    
    public Empleado(String nombre, String puesto){
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 700;
        totalEmpleados++;
        this.id = ++totalEmpleados;
    }
    
    public void actualizarSalario(double porcentaje){
        this.salario = salario + (salario / 100 * porcentaje);
    }
    
    public void actualizarSalario(int cantidad){
        this.salario += cantidad;
    }

    @Override
    public String toString() {
        return "Empleado{" + "\n\tid = " + id + ",\n\tnombre = " + nombre + ",\n\tpuesto = " + puesto + ",\n\tsalario = " + salario + "\n}";
    }
    
    public static int mostarTotalEmpleados(){
        return totalEmpleados;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public static int getTotalEmpleados() {
        return totalEmpleados;
    }

    public static void setTotalEmpleados(int totalEmpleados) {
        Empleado.totalEmpleados = totalEmpleados;
    }
    
    
}
