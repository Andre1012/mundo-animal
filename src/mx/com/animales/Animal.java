package mx.com.animales;

public abstract class Animal {
    private String nombre;
    private int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarInformacion(){
        System.out.println("Animal { Nombre: " + this.nombre + ", Edad: " + this.edad + " }");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void hacerSonido();
}
