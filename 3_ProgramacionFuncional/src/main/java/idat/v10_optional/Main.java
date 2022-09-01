package idat.v10_optional;

import java.util.Comparator;
import java.util.Optional;
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

    public Main(){
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



        //System.out.print("Maximo: ");
        //maximo.ifPresent(valor -> System.out.println("Maximo: "+ valor.doubleValue()));
        //double maxdouble = maximo.orElse(0);
        //System.out.println(maxdouble);

    }

    private int randomInt(){
        return random.nextInt(10);
    }

}
