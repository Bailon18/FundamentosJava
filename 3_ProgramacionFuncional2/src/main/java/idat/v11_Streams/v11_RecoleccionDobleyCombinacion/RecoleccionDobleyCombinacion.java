package idat.v11_Streams.v11_RecoleccionDobleyCombinacion;

import idat.v11_Streams.v7_collect.Book;
import idat.v11_Streams.v7_collect.Genre;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecoleccionDobleyCombinacion {

    public static void main(String[] args) {
        new RecoleccionDobleyCombinacion();
    }
    public RecoleccionDobleyCombinacion(){

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

        // Hallar la diferencia entre el año maximo y minimo
        // funcionalidad solo recorrer una unica ves la lista

        /*
        Integer diferencia = myBook.stream()
                .filter(book -> book.getYearOfPublication() < 1000)
                .map(Book::getYearOfPublication)
                .collect(Collectors.teeing(
                        Collectors.maxBy(Integer::compare),
                        Collectors.minBy(Integer::compare),
                        (maxOptional, minOptional) -> maxOptional.orElse(0) - minOptional.orElse(0))
                );*/
        Integer resultado = myBook.stream()
                .map(Book::getYearOfPublication)
                //.filter(fecha -> fecha < 1000)
                .collect(Collectors.teeing(
                                Collectors.maxBy(Integer::compare),
                                Collectors.minBy(Integer::compare),
                                (maxOptional, minOptional) -> maxOptional.map(max -> max - minOptional.get())
                        )
                ).orElse(null);




        System.out.println("Diferencia: "+ resultado);

        System.out.println(" ");
        //System.out.println(resultado);

    }







}
