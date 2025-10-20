package programacion2.TP5.Actividad13;

public class GeneradorQR {
    public void generar(String valor, Usuario usuario){
        System.out.println("Código QR " + valor + " generado para el usuario " + usuario.getNombre());
    }
}
