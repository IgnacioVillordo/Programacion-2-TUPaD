package programacion2.TP5.Actividad06;

public class Cliente {
    private String nombre;
    private String telefono;
    private Reserva reserva;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Reserva getReserva() {
        return reserva;
    }

    public void setReserva(Reserva reserva) {
        this.reserva = reserva;
        if(reserva != null && reserva.getCliente() != this){
            reserva.setCliente(this);
        }
    }
    
    
}
