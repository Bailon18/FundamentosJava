package genericosClases;

public class Animal {

    private String nombre;
    private TipoAnimal tipo;

    public Animal(String nombre, TipoAnimal tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public TipoAnimal getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Animal [nombre=" + nombre + ", tipo=" + tipo + "]";
    }

    
}
