package idat.v11_Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


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

            List<String> nombres = Arrays.asList("Manolo", "Pedro", "Mauro");

            // 1. Funcion generadora del stream
            List<String> lista = nombres.stream()

                    .filter(nombre -> nombre.contains("P")) // 2. 0 o mas operaciones intermedias
                    .limit(1)
                    .collect(Collectors.toList());// 3. operacion terminal -> no retornan un stream
                    //.forEach(System.out::println);
            
            System.out.println(lista);
            //lista.forEach(System.out::println);

            /* 

            //Optional<Integer> maximo = Flujo
            Flujo
            .proveer(10 , this::randomInt) // metodo refe -> instancia
            //.filtrar(NumberUtils::esPrimo) // metodo refe -> static
            //.filtrar(NumberUtils::esPrimo)
            
            .filtrar(valor -> valor >= 10)
            .orderar(Integer::compareTo)
            .transformar(NumberUtils::elevarCuadrado) 
            .transformar(Descripcion::new) // metodo refe -> constructor
            .actuar(System.out::println)
            //.transformar(descripcion -> descripcion.getValue())
            .transformar(Descripcion::getValue)
            //.reducir(0, Integer::sum);
            //.max((valor1, valor2) -> valor2 - valor1);
            .max(Comparator.naturalOrder())
            .ifPresentOrElse(
                valor -> System.out.println("Maximo: "+ valor.doubleValue()),
                () -> System.out.println("No hay maximo porque el flujo esta vacio")
            );
            */



    }

    private int randomInt(){
        return random.nextInt(10);
    }

}
