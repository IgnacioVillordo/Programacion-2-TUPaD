package programacion2.TP3;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String Autos, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = Autos;
        setAnioPublicacion(anioPublicacion);
    }
    
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutos() {
        return autor;
    }

    public void setAutos(String Autos) {
        this.autor = Autos;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if(anioPublicacion < 0 || anioPublicacion > 2025){
            System.out.println("Año invalido");
        } else {
            this.anioPublicacion = anioPublicacion;
        }
    }

    public String mostrarInfo() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", anioPublicacion=" + anioPublicacion + '}';
    }
    
    
    
}
