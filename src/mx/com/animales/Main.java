package mx.com.animales;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       // Animal animal = new Animal("Giuseppe",2); // No puedo crear una instancia de Animal porque debo implementar el metodo abstracto hacerSonido

        // Creando el Arraylist de la clase Animal
        ArrayList<Animal> animales = new ArrayList<>();

        // Creando instancias de Vaca, Perro, Gato
        Gato gato1 = new Gato("Giuseppe", 2);
        Perro perro1 = new Perro("Bolt", 3);
        Vaca vaca1 = new Vaca("Manchas", 5);
        Caballo caballo1 = new Caballo("Spirit", 7);

        animales.add(gato1);
        animales.add(perro1);
        animales.add(vaca1);
        animales.add(caballo1);

        // Recorriendo el Arraylist
        for(Animal animal: animales){
            animal.mostrarInformacion();
            animal.hacerSonido();
            Movible movible = (Movible) animal;
            movible.moverse();
            System.out.println();
        }

    }
}
