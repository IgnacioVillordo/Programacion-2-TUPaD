package programacion2.TP5.Actividad08;

import java.util.Date;

public class FirmaDigital {
    
    private int codigoHash;
    private Date fecha;
    private Usuario usuario;

    public FirmaDigital(int codigoHash) {
        this.codigoHash = codigoHash;
    }

    public int getCodigoHash() {
        return codigoHash;
    }

    public void setCodigoHash(int codigoHash) {
        this.codigoHash = codigoHash;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    
}
