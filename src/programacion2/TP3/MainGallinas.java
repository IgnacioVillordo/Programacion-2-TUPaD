package programacion2.TP3;

public class MainGallinas {
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina(0, 1, 0);
        Gallina gallina2 = new Gallina(1, 3, 0);
        
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.ponerHuevo();
        gallina1.envejecer();
        gallina1.envejecer();
        System.out.println(gallina1.mostrarEstado());
        
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.ponerHuevo();
        gallina2.envejecer();
        gallina2.envejecer();
        gallina2.envejecer();
        gallina2.envejecer();
        gallina2.envejecer();
        System.out.println(gallina2.mostrarEstado());
    }
}
