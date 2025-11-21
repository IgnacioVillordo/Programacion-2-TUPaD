package programacion2.TP7.Apartado4;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Animal> animales = new LinkedList<>();

        Animal perro1 = new Perro("Otto");
        Animal perro2 = new Perro("Kira");
        Animal gato1 = new Gato("Minina");
        Animal gato2 = new Gato("Garfield");
        Vaca vaca = new Vaca("Lola");

        animales.add(perro1);
        animales.add(perro2);
        animales.add(gato1);
        animales.add(gato2);
        animales.add(vaca);

        for (int i = 0; i < animales.size(); i++) {
            Animal a = animales.get(i);
            if (a instanceof Perro) System.out.print("Soy un perro");
            else if(a instanceof Gato) System.out.print("Soy un gato");
            else if(a instanceof Vaca) System.out.print("Soy una vaca");
            
            System.out.print(", mi nombre es " + a.getNombre() + " ");
            a.hacerSonido();
        }
    }
}

