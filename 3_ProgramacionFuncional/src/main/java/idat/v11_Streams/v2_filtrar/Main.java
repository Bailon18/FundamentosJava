package idat.v11_Streams.v2_filtrar;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {

    Random ran = new Random();


    public Main() {


         List<Integer> resultado = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                                            .filter(valor -> valor % 2 == 0)
                                            .limit(3)
                                            .collect(Collectors.toList());


        System.out.println(resultado);
    }

    public static void main(String[] args) {
        new Main();
    }
}
