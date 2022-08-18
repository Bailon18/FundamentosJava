package idat.v1_VersionIperativa;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main(){

        /*Crear lista de numeros */
        List<Integer> numeros = crearLista();

        System.out.println("Lista de Números");
        imprimirLista(numeros);


        /*Mostrar la lista solo de numeros pares */
        List<Integer>  pares = filtrarPares(numeros);
        System.out.println("Lista de Números Pares");
        imprimirLista(pares);

        /*Pasar cada numero al cuadrado */
        List<Integer>  numeroCuadrado = pasaralCuadrado(numeros);
        System.out.println("Lista de Números al cuadrado");
        imprimirLista(numeroCuadrado);

        System.out.println("Suma de Números al cuadrado");
        int suma = sumarCuadrado(numeroCuadrado);
        System.out.println(suma);


    }
    
    private List<Integer> crearLista(){

        return List.of(0, 1, 2, 3, 5, 8, 13, 23, 34, 89, 144);
    }

    private List<Integer> filtrarPares(List<Integer> lista){

        List<Integer> listaPares = new ArrayList<>();

        for(Integer numero : lista){

            if(numero % 2 == 0){
                listaPares.add(numero);
            }
        }

        return listaPares;
    }

    private List<Integer> pasaralCuadrado(List<Integer> lista){

        List<Integer> numeroAlCuadrado = new ArrayList<>();

        for (Integer numero : lista) {
            numeroAlCuadrado.add((int) Math.pow(numero, 2));
        }
        return numeroAlCuadrado;
    }


    private int sumarCuadrado(List<Integer> lista){

        int suma = 0;

        for (Integer numero : lista) {
            suma+=numero;
        }

        return suma;
    }

    private void imprimirLista(List<?> lista){

        lista.forEach(System.out::println);
    }
}
