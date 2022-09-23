package idat.v11_Streams.v7_collect;

import java.util.*;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class GroupByReduccionSimples {

    public void main(){

        List<Book> myBook = Arrays.asList(
                new Book("345-34", "Sufriendo a Pedro", 2018, Genre.TERROR),
                new Book("928-23", "Los papeles por delante", 1998, Genre.TRILLER),
                new Book("325-27", "La vida del baldomero", 2017, Genre.COMEDY),
                new Book("928-23", "Los papeles por delante", 1998, Genre.TRILLER),
                new Book("866-93", "Alien vs Depredador", 2017, Genre.ACCION),

                new Book("023-93", "La oscuridad", 2000, Genre.TERROR),
                new Book("345-64", "Todo Poderosos", 2019, Genre.COMEDY),
                new Book("743-34", "Luna", 1956, Genre.ACCION),
                new Book("856-64", "Avengers", 2022, Genre.ACCION),
                new Book("332-73", "Chukchi", 1992, Genre.TERROR)
        );

        // retorna un map<año, cantidadAño>
        Map<Integer, Long> resultado2 = myBook.stream()
                .filter(book -> book.getYearOfPublication() < 2000)
                .collect(Collectors.groupingBy(Book::getYearOfPublication,
                                                Collectors.counting()));
        // retorna long cantidad total
        long resul = myBook.stream()
                .filter(book -> book.getYearOfPublication() < 2000)
                .count();

        // Collectors.summarizingInt -> suma por un meto -> retorna un IntSummaryStatistics
        Map<Genre, IntSummaryStatistics> resultado3 = myBook.stream()
                .collect(Collectors.groupingBy(Book::getGenre,
                        Collectors.summarizingInt(Book::getYearOfPublication)));

        // Collectors.summingInt(int) -> retorna un Map< ?, Integer>
        // Collectors.summingLong -> retorna un Map< ?, Long>
        // Collectors.summingDouble -> retorna un Map< ?, >Double>
        Map<Genre, Integer> resultado4 = myBook.stream()
                .collect(Collectors.groupingBy(Book::getGenre,
                        Collectors.summingInt(Book::getYearOfPublication)));


        // minBy --> una vez agrupados los elemento obtener el MENOR del grupo
        // maxBy --> una vez agrupados los elemento obtener el MAYOR del grupo

        // Obtener el libro mas antiguo por genero
        Map<Genre, Optional<Book>> resultado5 = myBook.stream()
                .collect(Collectors.groupingBy(Book::getGenre,
                        Collectors.maxBy(Comparator.comparing(Book::getYearOfPublication))));

        // Collectors.summarizingInt(int) -> retorna un Map< ?, IntSummaryStatistics>
        // Collectors.summarizingLong -> retorna un Map< ?, LongSummaryStatistics>
        // Collectors.summarizingDouble -> retorna un Map< ?, >DoubleSummaryStatistics>

        /* {count=2, sum=3996.000000, min=1998.000000, average=1998.000000, max=1998.000000}*/
        Map<Genre, IntSummaryStatistics> resultado6 = myBook.stream()
                .collect(Collectors.groupingBy(Book::getGenre,
                        Collectors.summarizingInt(Book::getYearOfPublication)));

        System.out.println("");
        resultado5.forEach((k,v) -> System.out.println("Genero: " + k + ": Libro: " + v));


    }

    public static void main(String[] args) {
        GroupByReduccionSimples ms = new GroupByReduccionSimples();
        ms.main();
    }

}
