package v1_PCreacion_Singleton;

/*
 * El patrón de diseño Singleton (instancia única) está diseñado para restringir la creación
 *  de objetos pertenecientes a una clase o el valor de un tipo a un único objeto. Su intención
 *  consiste en garantizar que una clase sólo tenga una instancia y proporcionar un punto
 *  de acceso global a ella(static).
 * */

public class EjemploSingleton {

    // Singleton -> una sola instancia - Patron creacional
    public static void main(String[] args) {

        for(int i = 0; i < 10; i++){
            ConexionBdSingleton con = ConexionBdSingleton.getInstancia();
            System.out.println("con = " + con);
        }

        ConexionBdSingleton con2 = ConexionBdSingleton.getInstancia();
        System.out.println("con2 = " + con2);
        ConexionBdSingleton con3 = ConexionBdSingleton.getInstancia();
        System.out.println("con3 = " + con3);
    }

}
