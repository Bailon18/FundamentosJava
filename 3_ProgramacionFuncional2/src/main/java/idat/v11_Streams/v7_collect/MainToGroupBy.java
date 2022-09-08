package idat.v11_Streams.v7_collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainToGroupBy {

    public void main(){

        List<Book> myBook = Arrays.asList(
                new Book("345-34", "Sufriendo a Pedro", 2018, Genre.TERROR),
                new Book("928-23", "Los papeles por delante", 1998, Genre.TRILLER),
                new Book("325-27", "La vida del baldomero", 2017, Genre.COMEDY),
                new Book("928-23", "Los papeles por delante", 1998, Genre.TRILLER),
                new Book("866-93", "Alien vs Depredador", 2017, Genre.ACCION)
        );

        // retorna un map<año, Libro>
        Map<Integer, List<Book>> resultado = myBook.stream()
                .collect(Collectors.groupingBy(Book::getYearOfPublication));

        // retorna un map<año, tituloLibros->concatenados >
        Map<Integer, String> resultado2 = myBook.stream()
                .collect(Collectors.groupingBy(
                        Book::getYearOfPublication,
                        Collectors.mapping(Book::getTitle, Collectors.joining(", "))));

        System.out.println("");
        resultado.forEach((k,v) -> System.out.println("Clave: " + k + ": Valor: " + v));
        resultado2.forEach((k,v) -> System.out.println("Clave: " + k + ": Valores: " + v));
        /*for (Map.Entry<Integer, List<Book>> entry : resultado.entrySet()) {
             System.out.println("clave=" + entry.getKey() + ", valor=" + entry.getValue());
        }*/

    }

    public static void main(String[] args) {
        MainToGroupBy ms = new MainToGroupBy();
        ms.main();
    }

}
