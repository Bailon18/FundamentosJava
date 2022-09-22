package idat.v11_Streams.v7_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class RecoletarToSet {
    
    public RecoletarToSet(){

        List<Book> myBooks = Arrays.asList(
            new Book("345-34", "Sufriendo a Pedro", 2018, Genre.TERROR),
            new Book("928-23", "Los papeles por delante", 1998, Genre.TRILLER),
            new Book("325-27", "La vida del baldomero", 2017, Genre.COMEDY),
            new Book("928-23", "Los papeles por delante", 1998, Genre.TRILLER),
            new Book("866-93", "Alien vs Depredador", 2017, Genre.ACCION)
        );

        Set<Book> resulta = myBooks.stream()
                    .filter(book -> book.getYearOfPublication() < 2000)
                    //.collect(Collectors.toSet()); // Collectors.toUnmodifiableList() -> no es modificable
                    .collect(Collectors.toCollection(TreeSet::new));  //para cambiar el tipo de retorno

        
        System.out.println("");                    
        resulta.forEach(System.out::println);

    }

    public static void main(String[] args) {
        new RecoletarToSet();
    }
}
