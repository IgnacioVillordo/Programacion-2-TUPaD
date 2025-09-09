package programacion2.TP3;

public class MainMascotas {
    public static void main(String[] args) {
        Mascota mascota = new Mascota("Tobi", "Perro", 9);
        System.out.println(mascota.mostrarInfo());
        //2026
        mascota.cumplirAnios();
        System.out.println(mascota.mostrarInfo());
        //2027
        mascota.cumplirAnios();
        System.out.println(mascota.mostrarInfo());
        //2028
        mascota.cumplirAnios();
        System.out.println(mascota.mostrarInfo());
    }
}
