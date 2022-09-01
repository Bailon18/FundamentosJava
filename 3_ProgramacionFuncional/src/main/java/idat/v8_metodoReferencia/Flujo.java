package idat.v8_metodoReferencia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;



public class Flujo<T> {


    private final List<T> valores;

    public Flujo(List<T> valores) {
        this.valores = valores;
    }


    public static <T>  Flujo<T> proveer(int cantidad, Supplier<T> provee) {
        List<T> resultado = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            resultado.add(provee.get());
        }
        return new Flujo<>(resultado);
    }


    public Flujo<T> filtrar(Predicate<T> predicado) {
        List<T> resultado = new ArrayList<>();
        for (T valor : valores) {
            if (predicado.test(valor)) { // soloPares(0)
                resultado.add(valor);
            }
        }
        return new Flujo<>(resultado);
    }


    public <R> Flujo<R> transformar(Function<T, R>  funcion) {
        List<R> resultado = new ArrayList<>();
        for (T valor: valores) {
            resultado.add(funcion.apply(valor));
        }
        return new Flujo<>(resultado);
    }


    public Flujo<T> actuar(Consumer<T> consumidor) {
        for (T valor : valores) {
            consumidor.accept(valor);
        }
        return new Flujo<>(valores);
    }


    public void consumir(Consumer<T> consumidor) {
        for (T valor : valores) {
            consumidor.accept(valor);
        }
    }

    public Flujo<T> orderar(Comparator<T> comparador){
        
        List<T> listarOrdenada = new ArrayList<>(valores);
        listarOrdenada.sort(comparador);
        return new Flujo<>(listarOrdenada);
    }


    public T reducir(T identidad, BinaryOperator<T> funcionbinaria) {
        T total = identidad;
        for (T valor : valores) {
            total = funcionbinaria.apply(total, valor);
        }
        return total;
    }


    @Override
    public String toString() {
        return "Flujo [valores=" + valores + "]";
    }

    
}
