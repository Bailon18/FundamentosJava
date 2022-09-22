package idat.v11_Streams.v7_collect.OrdenacionComparadores;

import idat.v11_Streams.v7_collect.Book;
import idat.v11_Streams.v7_collect.Genre;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class OrdenacionXcomparador {

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

        List<Book> resultado = myBook.stream()
                // Compara primero por genero y si son iguales , compara por año de publicacion
                .sorted(Comparator.comparing(Book::getGenre)
                        .thenComparing(Book::getYearOfPublication, Comparator.reverseOrder()))
                //.sorted(Comparator.comparing(Book::getGenre, Comparator.reverseOrder())) // no depende de comprable en la clase
                //.sorted((book1, book2) -> book2.getGenre().compareTo(book1.getGenre())) // string
                //.sorted((book1, book2) -> book1.getYearOfPublication() - book2.getYearOfPublication()) // int
                //.sorted(Comparator.naturalOrder()) // para aplicar eso tiene que hacerlo dentro del Book
                .toList();

        resultado.forEach(System.out::println);

    }

    public static void main(String[] args) {

        OrdenacionXcomparador s = new OrdenacionXcomparador();
        s.main();
    }
}
