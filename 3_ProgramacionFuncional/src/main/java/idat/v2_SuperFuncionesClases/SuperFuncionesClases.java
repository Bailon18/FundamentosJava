

package idat.v2_SuperFuncionesClases;

import java.util.List;

import idat.v2_SuperFuncionesClases.Clases.FunBiMultiplicar;
import idat.v2_SuperFuncionesClases.Clases.FunElevarCubo;
import idat.v2_SuperFuncionesClases.Clases.Impresor;
import idat.v2_SuperFuncionesClases.Clases.ProNatural;
import idat.v2_SuperFuncionesClases.Clases.SoloImpares;


/**
 *
 * @author paucar
 */
public class SuperFuncionesClases {

    public static void main(String[] args) {
        new SuperFuncionesClases();
    }

    public SuperFuncionesClases(){

        /*Crear lista de numeros aleatorio o naturales*/
        List<Integer> numeros = SuperFunciones.proveer(10, new ProNatural());
        System.out.println("Lista de Números");
        imprimirLista(numeros);


        /*Filtrar la lista solo de numeros pares o impares*/
        List<Integer>  filtrados  = SuperFunciones.filtrar(numeros, new SoloImpares());
        System.out.println("Lista de Números Pares o Impares");
        imprimirLista(filtrados);


        /*Transformar una lista a cuadrado o cubo */
        List<Integer> tranformados = SuperFunciones.convertir(filtrados , new FunElevarCubo());
        System.out.println("Lista de Números Transformados");
        imprimirLista(tranformados);


        /* Mostrar por pantalla  // retorna | No retorna */
        //List<Integer> mostrados = SuperFunciones.actuar(tranformados, new Impresor());
        SuperFunciones.consumir(tranformados, new Impresor());


        /*Sumar Lista */
        Integer reducir = SuperFunciones.reducir(tranformados, 1, new FunBiMultiplicar());
        System.out.println("Multiplicar Lista");
        System.out.println(reducir);




    }
    

    private void imprimirLista(List<?> lista){

        System.out.println(lista);
        System.out.println();
    }
}
