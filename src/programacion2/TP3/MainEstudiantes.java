package programacion2.TP3;

public class MainEstudiantes {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Lionel", "Messi", "3A", 8);
        System.out.println(estudiante.mostrarInfo());
        estudiante.subirCalificacion(2);
        System.out.println(estudiante.mostrarInfo());
        estudiante.bajarCalificacion(4);
        System.out.println(estudiante.mostrarInfo());
    }
}
