package v1_PCreacion_Singleton;



public class ConexionBdSingleton {

    private static ConexionBdSingleton instancia;

    // constructor privado
    private ConexionBdSingleton(){
        System.out.println("Connexion algún motor de BD");
    }

    // método que crea una instancia del objeto si este no existe.
    public static ConexionBdSingleton getInstancia(){
        if(instancia == null){
            instancia = new ConexionBdSingleton();
        }
        return instancia;
    }

}
