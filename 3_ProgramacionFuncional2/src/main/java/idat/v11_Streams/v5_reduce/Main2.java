package idat.v11_Streams.v5_reduce;


import java.util.stream.Stream;




/**
 *
 * @author paucar
 */
public class Main2 {
    
    public Main2(){
        
        /*
        En pocas palabras, si usamos flujos secuenciales
        y los tipos de argumentos del acumulador y los tipos de su
        implementación coinciden, no necesitamos usar un combinador.
        */
        
        Integer resultado = Stream.of(
                new Student("Manolo", 18),new Student("Juan", 20),
                new Student("Mario", 10), new Student("Jorge", 39),
                new Student("Robert", 21), new Student("Bailon", 16),
                new Student("Ximena", 50), new Student("Andres", 12))
                .reduce(
                0, // identidad
                (acumulador, student) -> acumulador + student.getAge(),//acumulador
                (parcial1 , parcial2) -> parcial1 + parcial2 );// combinador
        
        
        System.out.println("Re: "+ resultado);
        
    
    }
    
    public static void main(String[] args) {
        new Main2();
    }
    
}
