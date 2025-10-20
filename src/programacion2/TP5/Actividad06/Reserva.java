package programacion2.TP5.Actividad06;

import java.time.LocalTime;
import java.util.Date;

public class Reserva {
    
    private Date fecha;
    private LocalTime hora;
    private Mesa mesa;
    private Cliente cliente;

    public Reserva(Date fecha, LocalTime hora, Mesa mesa, Cliente cliente) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(cliente != null && cliente.getReserva() != this){
            cliente.setReserva(this);
        }
    }
    
    
}
