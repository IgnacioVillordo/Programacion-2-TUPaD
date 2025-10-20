package programacion2.TP5.Actividad01;

import java.util.Date;

public class Pasaporte {

    private String numero;
    private Date fechaEmision;
    private Foto foto;
    private Titular titular;

    public Pasaporte(String numero, Date fechaEmision, String foto) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(foto);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public void mostrarFoto() {
        System.out.println("Foto: " + foto);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }
    
    public Titular getTitular() {
        return titular;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }
    
}
