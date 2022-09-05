package idat.v11_Streams.v6_OperacionesTerminalesConsulta;

import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    
    /*
     * Retorna un boolean
     * 
     * 3 metodos: 
     * 
     * allMatch(predicate) -> retorna true si todos el elementos cumple con el predicado(condicion) 
     * noneMath(predicate) -> retorna true si ningun elemento cumple con el predicado(condicion)
     * anyMatch(predicate) -> retorna true si uno cumple con el predicado(condicion)
     * 
     * 
     * findFirst() -> retorna el primer elemento tipo Optional<T>
     * findAny() -> retorna cualquier elemento tipo optional<T>
     */

    public Main(){

        boolean resultado = Stream.of(1, 2, 3, 4)
            .allMatch(n -> n % 2 != 0);

        System.out.println(resultado);


        Optional<Integer> resul = Stream.of(1, 2, 3)
            .filter(valor -> valor % 2 != 0)
            .findAny();

        System.out.println(resul.get());
        
    }

    public static void main(String[] args) {
        new Main();
    }
}
