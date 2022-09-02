package idat.v8_metodoReferencia;

import java.util.Random;
import static idat.v8_metodoReferencia.NumberUtils.*;

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
        Integer total = Flujo
            .proveer(10 , this::randomInt)
            .filtrar(valor -> esPrimo(valor))
            .transformar(valor -> valor * elevarCuadrado(valor))
            .actuar(System.out::println)
            .reducir(0, Integer::sum);

        System.out.println("");
        System.out.println(total);
    }

    private int randomInt(){
        return random.nextInt(10);
    }

}
