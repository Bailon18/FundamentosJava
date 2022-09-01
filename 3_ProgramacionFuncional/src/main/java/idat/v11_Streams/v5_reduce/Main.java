
package idat.v11_Streams.v5_reduce;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 *
 * @author paucar
 */
public class Main {
    
    
    public Main(){
        
        /*
        Stream.of(1, 2, 3, 4, 5)
        //.filter(valor -> valor >= 6)
        .min(Comparator.naturalOrder())
        .ifPresentOrElse(System.out::println,
        () -> System.out.println("El stream ha quedado vacio"));
         */
        Integer result = Stream.of(1, 2, 3 ,4)
                //.filter(prdct)
                .filter(valor -> valor >= 7)
                
                /* cuando utilizamos sin valor inicial si necesitamos
                    el ifPresent ya que puede ser el caso que no tenga ningun
                    valor el stream */
                //.reduce((acumulador, valor) -> acumulador * valor)
                
                /* cuando utilizamos un valor inicial
                ya no necesitaria el ifPrese */
                .reduce(1 , (acumulador, valor) -> acumulador * valor);
                //.ifPresentOrElse(System.out::println,
                //    () -> System.out.println("No hay valor, no hay reduccion"));
        
        System.out.println("Res: "+result);
    }
    
    public static void main(String[] args) {
        new Main();
    }
}
