package genericosClases;

public class EjemploGenericos {
    
    public static void main(String[] args) {
        
        Camion<Animal> transporteCaballos = new Camion<>(8);
        transporteCaballos.agregar(new Animal("Lucas", TipoAnimal.CABALLO));
        transporteCaballos.agregar(new Animal("Sergio", TipoAnimal.CABALLO));
        transporteCaballos.agregar(new Animal("Grillo", TipoAnimal.CABALLO));
        transporteCaballos.agregar(new Animal("Tuquen", TipoAnimal.CABALLO));
        transporteCaballos.agregar(new Animal("Peregrino", TipoAnimal.CABALLO));

        
        Camion<Maquinaria> transporteMaquinaria = new Camion<>(4);
        transporteMaquinaria.agregar(new Maquinaria("Grua"));
        transporteMaquinaria.agregar(new Maquinaria("Perforadora"));
        transporteMaquinaria.agregar(new Maquinaria("Bulldozer"));


        Camion<Automovil> transporteAutomovil= new Camion<>(4);
        transporteAutomovil.agregar(new Automovil("Toyota"));
        transporteAutomovil.agregar(new Automovil("Mitsubishi"));
        transporteAutomovil.agregar(new Automovil("Hyundai"));

        imprimirCamion(transporteCaballos);
        imprimirCamion(transporteMaquinaria);
        imprimirCamion(transporteAutomovil);
    }

    public static <T> void imprimirCamion(Camion<T> camion){
        camion.forEach(System.out::println);
    }

}
