package idat.v11_Streams;


import java.util.Random;


/**
 *
 * @author paucar
 */
public class Main {


    Random  random = new Random();

    public static void main(String[] args) {
        new Main();
    }
   
    // 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

    /*
        Non-Terminal Operations

        filter()
        map()
        distinct()
        sorted()
        peek()

        Terminal Operations

        anyMatch()
        collect()
        count()
        findFirst()
        min()
        max()
        sum()
        average()
     */

    public Main(){
            
        Integer resultado = random.ints(10 , 1 , 11)
            .boxed()
            .filter(valor -> valor>=5)
            .sorted(Integer::compareTo) // reverseOrder
            .map(valor -> valor * valor) // NumberUtils::elevarCuadrado
            .map(Descripcion::new)
            .peek(System.out::println)
            .map(Descripcion::getValue)
            //.max(Comparator.naturalOrder())
            //.ifPresentOrElse(
            //    valor -> System.out.println("Maximo: "+ valor.doubleValue()),
            //    () -> System.out.println("No hay maximo porque el flujo esta vacio")
            //)
            .reduce(0,(acumula, valor ) -> acumula + valor);
            
        System.out.println("Resul "+ resultado);


    }

}
