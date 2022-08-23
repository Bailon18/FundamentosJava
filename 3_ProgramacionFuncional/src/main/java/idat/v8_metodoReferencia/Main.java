package idat.v8_metodoReferencia;

import java.util.Random;
import static idat.v8_metodoReferencia.NumberUtils.*;

/**
 *
 * @author paucar
 */
public class Main {

    public static void main(String[] args) {
        new Main();
    }

    // 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

    public Main(){


        Random  random = new Random();

        Integer total = Flujo
            .proveer(10 , () -> random.nextInt(10))
            .filtrar(valor -> esPrimo(valor))
            .transformar(valor -> valor * elevarCuadrado(valor))
            .actuar(System.out::println)
            .reducir(0, (valor, valor2) ->  Integer.sum(valor, valor2));

        System.out.println("");
        System.out.println(total);
    }

}
