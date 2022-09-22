package idat.v11_Streams.v10_RecolectorCollectingAndThen;

import idat.v11_Streams.v7_collect.Book;
import idat.v11_Streams.v7_collect.Genre;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RecolectorCollectingAndThen {

    public static void main(String[] args) {
        new RecolectorCollectingAndThen();
    }
    public RecolectorCollectingAndThen(){

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

        // mapping -> primero transforma y luego recolecta
        // collectingAndThen -> primero recolecta y luego transforma

        //List<String> resultado = myBook.stream().map(Book::getTitle).toList();
        //Map<Integer, List<String>> resultado = myBook.stream()
        //        .collect(Collectors.groupingBy
        //                (Book::getYearOfPublication, Collectors.mapping(Book::getTitle, Collectors.toList())));

        //Map<Integer, Long> resultado = myBook.stream()
        //        .collect(Collectors.groupingBy(Book::getYearOfPublication, Collectors.counting()));

        //String resultado = myBook.stream()
        //        .collect(Collectors.collectingAndThen
        //                (Collectors.counting(), valor -> valor + " books"));

        Map<Integer, String> resultado = myBook.stream().collect(
                Collectors.groupingBy(Book::getYearOfPublication,
                                      Collectors.collectingAndThen(Collectors.counting(), valor -> valor + " Cantidad")));

        System.out.println(" ");
        //System.out.println(resultado);
        resultado.forEach((k,v) -> System.out.println("Año: " + k + " " + v));
    }







}
