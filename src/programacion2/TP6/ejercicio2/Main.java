package programacion2.TP6.ejercicio2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca de Alejandr�a");

        Autor a1 = new Autor("1", "Plat�n", "Griego");
        Autor a2 = new Autor("2", "Immanuel Kant", "Alem�n");
        Autor a3 = new Autor("3", "Germ�n Beder", "Argentino");

        biblioteca.agregarLibro("1", "La Rep�blica", 380, a1);
        biblioteca.agregarLibro("2", "Fed�n", 370, a1);
        biblioteca.agregarLibro("3", "Cr�tica de la raz�n pura", 1781, a2);
        biblioteca.agregarLibro("4", "Fundamentaci�n de la metaf�sica de las costumbres", 1785, a2);
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
