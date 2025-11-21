package programacion2.TP7.Apartado1;

public class Auto extends Vehiculo{

    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    @Override
    public String mostrarInfo() {
        return "Auto{" +
                "marca='" + super.getMarca() + '\'' +
                ", modelo='" + super.getModelo() + '\'' +
                ", cantidadPuertas=" + cantidadPuertas +
                '}';
    }
}
