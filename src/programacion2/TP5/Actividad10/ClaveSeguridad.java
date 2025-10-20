package programacion2.TP5.Actividad10;

import java.util.Date;

class ClaveSeguridad {
    private int codigo;
    private Date ultimaModificacion;

    public ClaveSeguridad(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getUltimaModificacion() {
        return ultimaModificacion;
    }

    public void setUltimaModificacion(Date ultimaModificacion) {
        this.ultimaModificacion = ultimaModificacion;
    }
    
    
}
