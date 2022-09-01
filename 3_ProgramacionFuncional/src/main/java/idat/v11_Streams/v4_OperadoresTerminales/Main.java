package idat.v11_Streams.v4_OperadoresTerminales;

import java.util.Comparator;
import java.util.stream.Stream;

public class Main {

    public Main(){

        /*
         * los operadores terminales no retornan nada
         * y son tratamientos INDIVIDUALES sobre los elementos
         * del STREAM
         * 
         * 1 - forEach(consumer) -> void
         * 2 - peek -> devuelve un stream de los elementos del stream base
         * 3 - forEachOrdered -> muestra ordenadamente
        */

        Stream.of(12, 9, 2, 6)
            .map(this::getMultiplicarNumeros)
            //.sorted((a, b) -> b.compareTo(a))
            //.sorted(Comparator.naturalOrder())
            .sorted(Comparator.reverseOrder())
            .forEachOrdered(System.out::println);

    }

    private Integer getMultiplicarNumeros(Integer valor) {
        return valor * 10;
    }

    public static void main(String[] args) {
        new Main();
    }
}
