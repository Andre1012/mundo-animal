package mx.com.animales;

public class Caballo extends Animal implements Movible{
    public Caballo(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " relincha");
    }

    @Override
    public void moverse() {
        System.out.println(getNombre() + " trota libremente a gran velocidad");
    }
}
