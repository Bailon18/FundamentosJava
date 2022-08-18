

package idat.v3_SuperFuncionesInlineClase;

import java.util.List;
import java.util.Random;

import idat.v2_SuperFuncionesClases.Interfaces.Consumidor;
import idat.v2_SuperFuncionesClases.Interfaces.Funcion;
import idat.v2_SuperFuncionesClases.Interfaces.Predicado;
import idat.v2_SuperFuncionesClases.Interfaces.Proveedor;
import idat.v2_SuperFuncionesClases.Interfaces.FuncionBInaria;


/**
 *
 * @author paucar
 */
public class SuperFuncionesClases {

    public static void main(String[] args) {
        new SuperFuncionesClases();
    }

    public SuperFuncionesClases(){

        /*Crear lista de numeros aleatorio */
        List<Integer> numeros = SuperFunciones.proveer(10, new Proveedor() {

            Random random = new Random();

            @Override
            public Integer obtener() {
                
                return random.nextInt(10);
            }
            
        });


        System.out.println("Lista de Números");
        imprimirLista(numeros);


        /*Filtrar la lista solo de numeros pares*/
        List<Integer>  filtrados  = SuperFunciones.filtrar(numeros, new Predicado(){

            @Override
            public boolean test(Integer valor) {
                return valor % 2 == 0;
            }

        });
        System.out.println("Lista de Números Pares");
        imprimirLista(filtrados);


        /*Transformar una lista a cubo */
        List<Integer> tranformados = SuperFunciones.convertir(filtrados , new Funcion(){

            @Override
            public Integer aplicar(Integer valor) {
                return valor * valor;
            }

        });

        System.out.println("Lista de Números Transformados a cuadrado");
        imprimirLista(tranformados);


        /* Mostrar por pantalla  // retorna | No retorna */
        //List<Integer> mostrados = SuperFunciones.actuar(tranformados, new Impresor());
        
        
        Consumidor impresor =  new Consumidor(){

            @Override
            public void aceptar(Integer valor) {
                System.out.println(valor);
            }

        };
        SuperFunciones.consumir(tranformados, impresor);


        /*Multiplicar Lista */
        Integer reducir = SuperFunciones.reducir(tranformados, 1, new FuncionBInaria(){

            @Override
            public Integer aplicar(Integer total, Integer valor) {
                return total * valor;
            }

        });
        System.out.println("Multiplicar Lista");
        System.out.println(reducir);


    }
    

    private void imprimirLista(List<?> lista){

        System.out.println(lista);
        System.out.println();
    }
}
