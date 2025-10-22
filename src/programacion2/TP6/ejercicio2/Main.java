package programacion2.TP6.ejercicio2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca de Alejandría");

        Autor a1 = new Autor("1", "Platón", "Griego");
        Autor a2 = new Autor("2", "Immanuel Kant", "Alemán");
        Autor a3 = new Autor("3", "Germán Beder", "Argentino");

        biblioteca.agregarLibro("1", "La República", 380, a1);
        biblioteca.agregarLibro("2", "Fedón", 370, a1);
        biblioteca.agregarLibro("3", "Crítica de la razón pura", 1781, a2);
        biblioteca.agregarLibro("4", "Fundamentación de la metafísica de las costumbres", 1785, a2);
        biblioteca.agregarLibro("5", "La vez que casi me muero y otros relatos", 2016, a3);

        biblioteca.listarLibros();

        System.out.println(biblioteca.buscarLibroPorIsbn("5"));

        ArrayList<Libro> anios = biblioteca.filtrarLibrosPorAnio(380);
        for (Libro l : anios) {
            System.out.println(l.mostrarInfo());
        }
        
        biblioteca.eliminarLibro("3");
        biblioteca.listarLibros();
        
        System.out.println(biblioteca.obtenerCantidadLibros());
        
        ArrayList<Autor> autores = biblioteca.mostrarAutoresDisponibles();
        for (Autor a : autores) {
            System.out.println(a.mostrarInfo());
        }

    }
}
