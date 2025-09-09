package programacion2.TP3;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String curso;
    private int calificacion;

    public Estudiante(String nombre, String apellido, String curso, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public String mostrarInfo() {
        return "Estudiante{ " + "nombre=" + nombre + ", apellido=" + apellido + ", curso=" + curso + ", calificacion=" + calificacion + '}';
    }

    public void subirCalificacion(int puntos) {
        while (puntos + calificacion > 10) {
            System.out.println("La suma supera los 10 puntos");
        }
        calificacion += puntos;
    }
    
    public void bajarCalificacion(int puntos) {
        while (puntos + calificacion < 1) {
            System.out.println("La suma es menor a 1 punto");
        }
        calificacion -= puntos;
    }

}
