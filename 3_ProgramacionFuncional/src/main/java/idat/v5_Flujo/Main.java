

package idat.v5_Flujo;

/* 
import java.util.List;
import java.util.Random;

import idat.v4_SuperFuncionesGenericos.Interfaces.Consumidor;
import idat.v4_SuperFuncionesGenericos.Interfaces.OperadorBinario;
import idat.v4_SuperFuncionesGenericos.Interfaces.OperadorUnario;
import idat.v4_SuperFuncionesGenericos.Interfaces.Predicado;
import idat.v4_SuperFuncionesGenericos.Interfaces.Proveedor;
*/


/**
 *
 * @author paucar
 */
public class Main {

    public static void main(String[] args) {
        new Main();
    }

    public Main(){

        // proveedr()  .filtrar()  .transformar()      .reducir()           .()actuar().
        // crearLista().soloPares().obtenerElCuadrado().sumarlosResultados().imprimirElResul()
    

        /*Crear lista de numeros aleatorio 
        List<Integer> numeros = Flujo.proveer(10, new Proveedor<>() {
            @Override
            public Integer obtener() {
                return new Random().nextInt(10);
            }
        });
        System.out.println("\nPROVEER: Lista de Números Aleatorios 1 - 10");
        imprimirLista(numeros);*/
        


        /*Filtrar la lista solo de numeros pares
        List<Integer>  filtrados  = Flujo.filtrar(numeros, new Predicado<>(){
            @Override
            public boolean test(Integer valor) {
                return valor % 2 == 0;
            }
        });
        System.out.println("FILTRAR: lista a lista de Pares");
        imprimirLista(filtrados);*/


        /*Transformar una lista a Cuadrado 
        List<Integer> tranformados = Flujo.transformar(filtrados , new OperadorUnario<>(){
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        });
        System.out.println("TRANSFORMAR:  Lista de Números a cuadrado");
        imprimirLista(tranformados);*/


        /* 
        Consumidor<Integer> impresor =  new Consumidor<>(){
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        };
        System.out.println("CONSUMER: impresion de la Lista");
        Flujo.consumir(tranformados, impresor); */


        /*Multiplicar Lista 
        Integer reducir = Flujo.reducir(tranformados, 1, new OperadorBinario<>(){
            @Override
            public Integer aplicar(Integer total, Integer valor) {
                return total * valor;
            }
        });
        System.out.println("\nREDUCIR: Multiplicacion de Lista");
        System.out.println(reducir);*/


    }
    
    /* 
    private void imprimirLista(List<?> lista){

        System.out.println(lista);
        System.out.println();
    }*/
}
