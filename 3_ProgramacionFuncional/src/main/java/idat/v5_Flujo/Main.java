package idat.v5_Flujo;

import java.util.Random;

import idat.v5_Flujo.Interfaces.Consumidor;
import idat.v5_Flujo.Interfaces.OperadorBinario;
import idat.v5_Flujo.Interfaces.OperadorUnario;
import idat.v5_Flujo.Interfaces.Predicado;
import idat.v5_Flujo.Interfaces.Proveedor;


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
    
        /* 

        //Crear lista de numeros aleatorio 
        Flujo<Integer> numeros = Flujo.proveer(10, new Proveedor<>() {
            @Override
            public Integer obtener() {
                return new Random().nextInt(10);
            }
        });
        System.out.println("\nPROVEER: Lista de Números Aleatorios 1 - 10");
        System.out.println(numeros);
        


        //Filtrar la lista solo de numeros pares
        Flujo<Integer>  filtrados  = numeros.filtrar(new Predicado<>(){
            @Override
            public boolean test(Integer valor) {
                return valor % 2 != 0;
            }
        });
        System.out.println("FILTRAR: lista a lista de Pares");
        System.out.println(filtrados);


        //Transformar una lista a Cuadrado 
        Flujo<Integer> tranformados = filtrados.transformar(new OperadorUnario<>(){
            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }
        });
        System.out.println("TRANSFORMAR:  Lista de Números a cuadrado");
        System.out.println(tranformados);


        Consumidor<Integer> impresor =  new Consumidor<>(){
            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }
        };
        System.out.println("CONSUMER: impresion de la Lista");
        tranformados.consumir(impresor);


        //Multiplicar Lista 
        Integer reducir = tranformados.reducir(1, new OperadorBinario<>(){
            @Override
            public Integer aplicar(Integer total, Integer valor) {
                return total * valor;
            }
        });
        System.out.println("\nREDUCIR: Multiplicacion de Lista");
        System.out.println(reducir);

        */

        Integer total = 
            Flujo.proveer(10, new Proveedor<Integer>() {
                @Override
                public Integer obtener() {
                    return new Random().nextInt(10);
                }
            }).filtrar(new Predicado<>(){
                @Override
                public boolean test(Integer valor) {
                    return valor % 2 != 0;
                }
            }).transformar(new OperadorUnario<>(){
                @Override
                public Integer aplicar(Integer valor) {
                    return valor * valor;
                }
            }).actuar(new Consumidor<>(){
                @Override
                public void aceptar(Integer valor) {
                    System.out.println(valor);
                }
            }).reducir(0, new OperadorBinario<>(){
                @Override
                public Integer aplicar(Integer total, Integer valor) {
                    return total + valor;
                }
            });

        System.out.println(total);



    }

}
