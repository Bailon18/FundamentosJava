package idat.v11_Streams.v9_StreamdeOptional;

import idat.v11_Streams.v7_collect.Book;
import idat.v11_Streams.v7_collect.Genre;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamOfOptional {

    public static void main(String[] args) {
        new StreamOfOptional();
    }
    public  StreamOfOptional(){

        List<String> isbns = List.of("345-34", "743-34", "no hay");

        /*
        List<Book> resultado = isbns.stream()
                .map(this::findByIsbn)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();
        */
        List<Book> resultado = isbns.stream()
                .map(this::findByIsbn)
                .flatMap(Optional::stream)
                .toList();

        System.out.println(resultado);

    }

    Optional<Book> findByIsbn(String isbn){

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

        return myBook.stream().filter(book -> book.getIsbn().equals(isbn)).findFirst();
    }

}
