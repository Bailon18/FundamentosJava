package idat.v11_Streams.v7_collect;

import java.util.Arrays;
import java.util.List;

public class ToList {
    
    /*
     * 
     * 
     * 
     * 
     */

    public ToList(){

        List<Book> myBooks = Arrays.asList(
            new Book("345-34", "Sufriendo a Pedro", 2018, Genre.TERROR),
            new Book("928-23", "Los papeles por delante", 1998, Genre.TRILLER),
            new Book("325-27", "La vida del baldomero", 2017, Genre.COMEDY),
            new Book("744-73", "La oscuridad de la noche", 1998, Genre.TERROR),
            new Book("866-93", "Alien vs Depredador", 2017, Genre.ACCION)
        );

        List<Book> resulta = myBooks.stream()
                .filter(book -> book.getYearOfPublication() < 2000)
                .toList(); // Collectors.toUnmodifiableList() -> no es modificable

        resulta.forEach(System.out::println);

    }

    public static void main(String[] args) {
        new ToList();
    }
}
