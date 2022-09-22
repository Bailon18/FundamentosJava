package idat.v11_Streams.v8_MapFIlterDeOptional;

import idat.v11_Streams.v7_collect.Book;
import idat.v11_Streams.v7_collect.Genre;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MapFilterOptional {

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

        myBook.stream()
                .sorted(Comparator.comparing(Book::getYearOfPublication, Comparator.reverseOrder()))
                .filter(book -> book.getYearOfPublication() >= 2020) // No hay primer libro si no se cumple
                .findFirst()
                .filter(book -> book.getGenre() == Genre.COMEDY) // no es COMEDY el primer libro si no se cumple
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("No hay un primer libro o el primero libro no es de COMEDIA")
                );


        //System.out.println(resultado);

    }

    public static void main(String[] args) {

        MapFilterOptional s = new MapFilterOptional();
        s.main();
    }
}
