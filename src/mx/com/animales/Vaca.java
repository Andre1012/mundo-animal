package mx.com.animales;

public class Vaca extends Animal implements Movible{
    public Vaca(String nombre, int edad){
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " muge");
    }

    @Override
    public void moverse() {
        System.out.println(getNombre() + " trota tranquilamente en el prado");
    }
}
