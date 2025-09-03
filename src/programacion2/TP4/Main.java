package programacion2.TP4;

public class Main {
    
    public static void main(String[] args) {
        Empleado empleado1 = new Empleado(1, "Clementina", "Gerencia", 2000);
        Empleado empleado2 = new Empleado(2, "Isidoro", "Administraci�n", 2000);
        Empleado empleado3 = new Empleado(3, "Anacleto", "Contaduria", 2000);
        Empleado empleado4 = new Empleado(4, "Benedictino", "Log�stica", 2000);
        Empleado empleado5 = new Empleado("Asunci�n", "Contadur�a");
        Empleado empleado6 = new Empleado("Policarpo", "Administraci�n");
        Empleado empleado7 = new Empleado("Ovidio", "Administraci�n");
        Empleado empleado8 = new Empleado("Narciso", "Log�stica");
        
        empleado1.actualizarSalario(21d);
        empleado2.actualizarSalario(400);
        empleado3.actualizarSalario(1400);
        empleado4.actualizarSalario(600);
        empleado5.actualizarSalario(140);
        empleado6.actualizarSalario(40d);
        empleado7.actualizarSalario(80d);
        empleado8.actualizarSalario(1000);
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
        System.out.println(empleado4.toString());
        System.out.println(empleado5.toString());
        System.out.println(empleado6.toString());
        System.out.println(empleado7.toString());
        System.out.println(empleado8.toString());
        
        System.out.println("Cantidad de total de empleados: " + Empleado.mostarTotalEmpleados());
    }
    
}
