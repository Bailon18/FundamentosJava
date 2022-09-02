package idat.v11_Streams.v1_FuncionGeneradoras;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    Random ran = new Random();

    // Suplayer -> no recibe nada pero retorna algo

    public Main() {

        /*
         // generate()
         List<Integer> resultado = Stream.generate(() -> {
                int next = ran.nextInt(100);
                //System.out.println("Se a generado: "+ next);
                return next;
         })
         .limit(10)
         .collect(Collectors.toList());
         */

        /* 
        // iterate(valorIncial , valor -> valor * 5) o iterate(valorIncial , condicion ,valor -> valor * 5)
        List<Integer> resultado = Stream.iterate(1, valor -> valor < 1000, valor -> valor * 5)
                .limit(10)
                .collect(Collectors.toList());

        */
         List<Integer> resultado = IntStream.range(1, 100)
                                            .boxed() // convierte a stream
                                            .collect(Collectors.toList());

        System.out.println(resultado);
    }

    public static void main(String[] args) {
        new Main();
    }
}
