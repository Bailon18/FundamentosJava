package idat.v11_Streams.v7_collect;

import java.util.*;
import java.util.stream.Collectors;

public class MainToGroupByPartition {

    public void main(){

        List<Book> myBook = Arrays.asList(
                new Book("928-23", "Los papeles por delante", 1998, Genre.TRILLER),
                new Book("928-23", "Los papeles por delante", 1998, Genre.TRILLER),
                new Book("345-34", "Sufriendo a Pedro", 2018, Genre.TERROR),
                new Book("023-93", "La oscuridad", 2000, Genre.TERROR),
                new Book("332-73", "Chukchi", 1992, Genre.TERROR),
                new Book("345-64", "Todo Poderosos", 2019, Genre.COMEDY),
                new Book("325-27", "La vida del baldomero", 2017, Genre.COMEDY),
                new Book("743-34", "Luna", 1956, Genre.ACCION),
                new Book("866-93", "Alien vs Depredador", 2017, Genre.ACCION),
                new Book("856-64", "Avengers", 2022, Genre.ACCION)
        );

        /*partitioningBy(predicate) -> retorna 2 grupos , true(cumple con la condition dada ,
         False con lo que no cumple) */

        Map<Boolean, List<Book>> resultado = myBook.stream()
                .collect(Collectors.partitioningBy(book -> book.getYearOfPublication() < 2000));

        /*partitioningBy(predicate, dawnsStreamCollectors) ->  */
        Map<Boolean, Long> resultado2 = myBook.stream()
                .filter(book -> book.getYearOfPublication() >= 2000)
                .collect(Collectors.partitioningBy(book -> book.getYearOfPublication() < 2000,
                        Collectors.counting()));

        System.out.println("");
        resultado2.forEach((k,v) -> System.out.println("Genero: " + k + ": Libro: " + v));


    }

    public static void main(String[] args) {
        MainToGroupByPartition ms = new MainToGroupByPartition();
        ms.main();
    }

}
/*
*         resultado2 = myBook.stream()
                .filter(book -> book.getYearOfPublication() >= 2000)
                .collect(Collectors.groupingBy(Book::getGenre, Collectors.counting()));
*
*
*
* */