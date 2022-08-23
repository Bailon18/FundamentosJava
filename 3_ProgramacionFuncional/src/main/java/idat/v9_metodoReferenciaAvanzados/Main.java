package idat.v9_metodoReferenciaAvanzados;

import java.util.Random;
import static idat.v9_metodoReferenciaAvanzados.NumberUtils.*;

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
            .proveer(10 , this::randomInt) // metodo refe -> instancia
            .filtrar(NumberUtils::esPrimo) // metodo refe -> static
            .orderar(Integer::compareTo)
            .transformar(NumberUtils::elevarCuadrado) 
            .transformar(Descripcion::new) // metodo refe -> constructor
            .actuar(System.out::println)
            //.transformar(descripcion -> descripcion.getValue())
            .transformar(Descripcion::getValue)
            .reducir(0, Integer::sum);

        System.out.println("");
        System.out.println(total);
    }

    private int randomInt(){
        return random.nextInt(10);
    }

}
