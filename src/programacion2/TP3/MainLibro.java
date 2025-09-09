package programacion2.TP3;

public class MainLibro {
    public static void main(String[] args) {
        Libro libro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);
        System.out.println(libro.mostrarInfo());
        libro.setAnioPublicacion(3048);
        System.out.println(libro.mostrarInfo());
        libro.setAnioPublicacion(1992);
        System.out.println(libro.mostrarInfo());
    }
}
