package programacion2.TP8.Apartado1;

public class TarjetaCredito implements PagoConDescuento {
    private static final double PORCENTAJE_DESCUETNO = 0.1;

    @Override
    public double aplicarDescuento(double monto) {
        return monto * PORCENTAJE_DESCUETNO;
    }

    @Override
    public double procesarPago(double monto) {
        double descuento = aplicarDescuento(monto);
        return monto - descuento;
    }
}
