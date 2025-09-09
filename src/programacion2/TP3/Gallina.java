package programacion2.TP3;

public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public Gallina(int idGallina, int edad, int huevosPuestos) {
        this.idGallina = idGallina;
        this.edad = edad;
        this.huevosPuestos = huevosPuestos;
    }
    
    public void ponerHuevo(){
        huevosPuestos++;
        System.out.println("Puse un huevo.");
    }
    
    public void envejecer(){
        edad++;
    }
    
    public String mostrarEstado() {
        return "Gallina{" + "idGallina=" + idGallina + ", edad=" + edad + ", huevosPuestos=" + huevosPuestos + '}';
    }
    
    
}
