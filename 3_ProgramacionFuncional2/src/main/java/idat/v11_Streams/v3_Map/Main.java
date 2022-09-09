package idat.v11_Streams.v3_Map;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class Main {

    Random ran = new Random();


    public Main() {

        /* 
        List<Integer> resultado = IntStream.range(1, 11)
                                        .boxed()
                                        .map(valor -> valor*2)
                                        .collect(Collectors.toList());
        */

        /* Flamap -> 
            recolecta todoo los elementos de los distintos streams que se an produciddo
            y meterlos en un unico stream 
        */
        List<Integer> resultado = 
                Stream.of(2, 4, 6)
                .flatMap(this::getRandomNumbers)
                .toList();

        /* Ejemplo de flatmap */


        List<String> leng1 = Arrays.asList("Python", "Java", "c#");
        List<String> leng2 = Arrays.asList("Mysql", "Sql Server", "Oracle");
        List<String> leng3 = Arrays.asList("Javascript", "css", "html", "Python");

        List<List<String>> lenguajes = Arrays.asList(leng1, leng2, leng3);
        // [[Python, Java, c#], [Mysql, Sql Server, Oracle], [Javascript, css, html, Python]]

        List<String> resulta = lenguajes.stream()
                .flatMap(Collection::stream)
                .distinct()
                .sorted((a, b) -> b.compareTo(a))
                .collect(Collectors.toList());

        System.out.println(resulta);
        // [Python, Java, c#, Mysql, Sql Server, Oracle, Javascript, css, html]
    }

    

    private Stream<Integer> getRandomNumbers(Integer size) {
        return ran.ints(size, 0, 10).boxed();
    }



    public static void main(String[] args) {
        new Main();
    }
}
