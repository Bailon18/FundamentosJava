package idat.v5_Flujo;

import java.util.ArrayList;
import java.util.List;

import idat.v5_Flujo.Interfaces.Consumidor;
import idat.v5_Flujo.Interfaces.Funcion;
import idat.v5_Flujo.Interfaces.OperadorBinario;
import idat.v5_Flujo.Interfaces.Predicado;
import idat.v5_Flujo.Interfaces.Proveedor;;

public class Flujo<T> {


    private final List<T> valores;

    public Flujo(List<T> valores) {
        this.valores = valores;
    }


    public static <T>  Flujo<T> proveer(int cantidad, Proveedor<T> provee) {
        List<T> resultado = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            resultado.add(provee.obtener());
        }
        return new Flujo<>(resultado);
    }


    public Flujo<T> filtrar(Predicado<T> predicado) {
        List<T> resultado = new ArrayList<>();
        for (T valor : valores) {
            if (predicado.test(valor)) { // soloPares(0)
                resultado.add(valor);
            }
        }
        return new Flujo<>(resultado);
    }


    public <R> Flujo<R> transformar(Funcion<T, R>  funcion) {
        List<R> resultado = new ArrayList<>();
        for (T valor: valores) {
            resultado.add(funcion.aplicar(valor));
        }
        return new Flujo<>(resultado);
    }


    public Flujo<T> actuar(Consumidor<T> consumidor) {
        for (T valor : valores) {
            consumidor.aceptar(valor);
        }
        return new Flujo<>(valores);
    }


    public void consumir(Consumidor<T> consumidor) {
        for (T valor : valores) {
            consumidor.aceptar(valor);
        }
    }

    public T reducir(T identidad, OperadorBinario<T> funcionbinaria) {

        T total = identidad;
        for (T valor : valores) {
            total = funcionbinaria.aplicar(total, valor);
        }
        return total;
    }


    @Override
    public String toString() {
        return "Flujo [valores=" + valores + "]";
    }

    
}
