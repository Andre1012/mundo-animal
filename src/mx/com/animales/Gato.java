package mx.com.animales;

public class Gato extends Animal implements Movible{
    public Gato(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " maulla");
    }

    @Override
    public void moverse() {
        System.out.println(getNombre() + " se mueve con sigilo y salta con precision");
    }
}
