package idat.v11_Streams.v7_collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RecolectarString {

    public void main(){

        List<Book> myBooks = Arrays.asList(
                new Book("345-34", "Sufriendo a Pedro", 2018, Genre.TERROR),
                new Book("928-23", "Los papeles por delante", 1998, Genre.TRILLER),
                new Book("325-27", "La vida del baldomero", 2017, Genre.COMEDY),
                new Book("928-23", "Los papeles por delante", 1998, Genre.TRILLER),
                new Book("866-93", "Alien vs Depredador", 2017, Genre.ACCION)
        );

        String resultant = myBooks.stream()
                .distinct()
                .filter(book -> book.getYearOfPublication() < 2000)
                .map(Book::getTitle)
                //.collect(Collectors.joining(", ")); /* joining - une los tituloss con un delimitador */
                //.collect(Collectors.joining(", ","[", "]"));
                /* podemos tener el map y join en una sola linea*/
                .collect(Collectors.joining(", "));

        System.out.println(resultant);
        // 001142600020012864448

    }

    public static void main(String[] args) {
        RecolectarString ms = new RecolectarString();
        ms.main();
    }
}
