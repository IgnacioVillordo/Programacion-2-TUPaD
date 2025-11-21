package programacion2.TP7.Apartado3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Empleado> arreglo = new ArrayList();
        int contTemporal = 0;
        int contPlanta = 0;
        
        Empleado e1 = new EmpleadoPlanta("Germán", 1000, 150);
        Empleado e2 = new EmpleadoPlanta("Alfredo", 30, 40);
        Empleado e3 = new EmpleadoPlanta("Lucas", 1800, 410);
        Empleado e4 = new EmpleadoTemporal("Joaquín", 800, 300);
        Empleado e5 = new EmpleadoTemporal("Roberto", 20, 50);
        
        arreglo.add(e1);
        arreglo.add(e2);
        arreglo.add(e3);
        arreglo.add(e4);
        arreglo.add(e5);
        
        for (int i = 0; i < arreglo.size(); i++) {
            System.out.println("Sueldo de " + arreglo.get(i).getNombre() + " = " + arreglo.get(i).calcularSueldo());
            if(arreglo.get(i) instanceof EmpleadoPlanta) contPlanta++;
            else if(arreglo.get(i) instanceof EmpleadoTemporal) contTemporal++;
        }
        System.out.println("Cantidadde  empleados en planta = " + contPlanta +
                "\nCantidad de empleados temporales = " + contTemporal);
    }
}
