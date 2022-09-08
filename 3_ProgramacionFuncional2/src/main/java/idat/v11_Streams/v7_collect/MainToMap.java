package idat.v11_Streams.v7_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainToMap{
    
    public MainToMap(){

        List<Book> myBooks = Arrays.asList(
            new Book("345-34", "Sufriendo a Pedro", 2018, Genre.TERROR),
            new Book("928-23", "Los papeles por delante", 1998, Genre.TRILLER),
            new Book("325-27", "La vida del baldomero", 2017, Genre.COMEDY),
            new Book("928-23", "Los papeles por delante", 1998, Genre.TRILLER),
            new Book("866-93", "Alien vs Depredador", 2017, Genre.ACCION)
        );

        Map<String, Book> resulta = myBooks.stream()
                    .filter(book -> book.getYearOfPublication() < 2000)
                    .distinct()
                    //.collect(Collectors.toMap(book -> book.getIsbn(), book -> book));  //
                    .collect(Collectors.toMap(Book::getIsbn, book -> book));
        
        System.out.println("");                    
        System.out.println(resulta);

    }

    public static void main(String[] args) {
        new MainToMap();
    }
}
