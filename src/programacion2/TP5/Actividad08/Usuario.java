package programacion2.TP5.Actividad08;

public class Usuario {
    
    private String nombre;
    private String email;
    private FirmaDigital firmaDigital;

    public Usuario(String nombre, String email, FirmaDigital firmaDigital) {
        this.nombre = nombre;
        this.email = email;
        this.firmaDigital = firmaDigital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    public void setFirmaDigital(FirmaDigital firmaDigital) {
        this.firmaDigital = firmaDigital;
    }
    
    
    
}
