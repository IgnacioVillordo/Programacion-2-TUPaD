package programacion2.TP3;

public class MainNaveEspacial {
    public static void main(String[] args) {
        NaveEspacial nave1 = new NaveEspacial("Nave 1", 50);
        nave1.avanzar(100);
        nave1.recargarCombustible(55);
        nave1.avanzar(100);
        System.out.println(nave1.mostrarInfo());
    }
}
