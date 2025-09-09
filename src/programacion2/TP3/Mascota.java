package programacion2.TP3;

public class Mascota {
    private String nombre;
    private String especie;
    private int edad;

    public Mascota(String nombre, String especie, int edad) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
    }

    public String mostrarInfo() {
        return "Mascota{ " + "nombre=" + nombre + ", especie=" + especie + ", edad=" + edad + '}';
    }
    
    public void cumplirAnios(){
        edad++;
    }
    
}
