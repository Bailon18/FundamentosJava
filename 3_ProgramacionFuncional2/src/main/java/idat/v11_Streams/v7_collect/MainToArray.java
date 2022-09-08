package idat.v11_Streams.v7_collect;

import java.util.Arrays;
import java.util.List;

public class MainToArray {

    public void main(){

        List<Book> myBooks = Arrays.asList(
            new Book("345-34", "Sufriendo a Pedro", 2018, Genre.TERROR),
            new Book("928-23", "Los papeles por delante", 1998, Genre.TRILLER),
            new Book("325-27", "La vida del baldomero", 2017, Genre.COMEDY),
            new Book("928-23", "Los papeles por delante", 1998, Genre.TRILLER),
            new Book("866-93", "Alien vs Depredador", 2017, Genre.ACCION)
        );

        Book[] results = myBooks.stream()
                .filter(book -> book.getYearOfPublication() > 2000)
                .distinct()
                //.toArray(size -> new Book[size]);// para convertir un array de Book 2479375 codigo
                .toArray(Book[]::new);

        Arrays.stream(results).forEach(System.out::println);


    }

    public static void main(String[] args) {
        MainToArray app = new MainToArray();
        app.main();
    }
    
}
