package genericos;

import java.util.Arrays;
import java.util.List;

import model.Cliente;
import model.ClientePremium;

/*  Bounded Genericos -> limitar los tipos genericos
    <T extends tipo>  -> <T extends Numbre> , <T extends Cliente>  
*/

public class BoundedGenericos {
    public static void main(String[] args) {
        
        Cliente[] Arregloclientes = {
            new Cliente("Bailon", "Paucar"),
            new Cliente("Kevin", "Paucar")
        };


        ClientePremium[] arregloClientePre = {
            new ClientePremium("Xiomara", "Noriega"),
            new ClientePremium("Rebeca", "Montes")           
        };

        List<Cliente> clientes= convertiraLista(Arregloclientes);
        List<ClientePremium> clientesPremi = convertiraLista(arregloClientePre);
        imprimirClientes(clientes);
        imprimirClientes(clientesPremi);
        
        



    }
    

    public static <T> List<T> convertiraLista(T[] c){
        return Arrays.asList(c);
    }

    // <T> limite solo que extienda de Number
    public static <T extends Number> List<T> convertiraLista(T[] c){
        return Arrays.asList(c);
    }


    // <T> limite solo que extienda de Cliente
    public static < T extends Cliente &  Comparable<T> > List<T> convertiraLista(T[] c){
        return Arrays.asList(c);
    }


    //    -> se definen
    public static <T, G> List<T> convertiraLista(T[] listaT, G[] listaG){
        
        for (G elemento : listaG) {
            System.out.println(elemento);
        }
        
        return Arrays.asList(listaT);
    }  
    
    // ? -> poder recibir lista hijas de cliente
    public static void imprimirClientes(List<? extends Cliente> clientes){

        clientes.forEach(System.out::println);
    }
}
