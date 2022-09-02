package idat.v7_interfacesFuncionalesEstandar;

import java.util.Random;

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
            .filtrar(valor -> valor % 2 == 0)
            .transformar(valor -> valor * valor)
            .actuar(System.out::println)
            .reducir(0, (valor, valor2) ->  valor + valor2);

        System.out.println("");
        System.out.println(total);
    }

}
