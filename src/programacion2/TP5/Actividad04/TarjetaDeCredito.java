package programacion2.TP5.Actividad04;

import java.util.Date;

public class TarjetaDeCredito {
    private String numero;
    private Date FechaVencimiento;
    private Cliente cliente;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(Date FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(cliente != null && cliente.getTarjetaDeCredito() != null){
            cliente.setTarjetaDeCredito(this);
        }
    }
    
    
}
