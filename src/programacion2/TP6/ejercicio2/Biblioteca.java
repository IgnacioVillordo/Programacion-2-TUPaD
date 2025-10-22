package programacion2.TP6.ejercicio2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    String nombre;
    List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro libro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(libro);
    }

    public void listarLibros() {
        for (Libro l : libros) {
            System.out.println(l.mostrarInfo());
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn() == isbn) {
                return l;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        libros.remove(this.buscarLibroPorIsbn(isbn));
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }
    
    public ArrayList<Libro> filtrarLibrosPorAnio(int anio) {
        ArrayList<Libro> aux = new ArrayList<>();
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) {
                aux.add(l);
            }
        }
        return aux;
    }
    
    public ArrayList<Autor> mostrarAutoresDisponibles() {
        ArrayList<Autor> autores = new ArrayList<>();
        for (Libro l : libros) {
            if (autores.contains(l.getAutor())) {
                autores.add(l.getAutor());
            }
        }
        return autores;
    }
}
