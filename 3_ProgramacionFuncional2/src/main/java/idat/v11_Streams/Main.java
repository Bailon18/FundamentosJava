package idat.v11_Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;


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
