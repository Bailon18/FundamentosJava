package genericos;


import java.util.Arrays;
import java.util.List;

import model.Cliente;

public class EjemploGenericos {

    public static void main(String[] args) {
        
        Cliente[] cliente = { 
            new Cliente("Bailon", "Paucar"),
            new Cliente("Kevin", "Paucar")
        };

        Integer[] enteros = {1, 2, 3, 4, 5};
        Double[] decimales = {1.1, 2.2, 3.3, 4.4, 5.5};
        String[] strings = {"Frutas", "Peras", "Manzanas"};

        List<Cliente> listaClientes = convertiraLista(cliente);
        List<Integer> listaEnteros = convertiraLista(enteros);
        
        List<Double> listaRetorno = convertiraLista(decimales, strings);
        System.out.println(listaRetorno);


    }
    

    // <T> parametros genericos
    public static <T> List<T> convertiraLista(T[] c){
        return Arrays.asList(c);
    }

    //    -> se definen
    public static <T, G> List<T> convertiraLista(T[] listaT, G[] listaG){
        
        for (G elemento : listaG) {
            System.out.println(elemento);
        }
        
        return Arrays.asList(listaT);
    }



}
