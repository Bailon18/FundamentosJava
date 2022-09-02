package idat.v4_SuperFuncionesGenericos;

import java.util.ArrayList;
import java.util.List;

import idat.v4_SuperFuncionesGenericos.Interfaces.Consumidor;
import idat.v4_SuperFuncionesGenericos.Interfaces.Funcion;
import idat.v4_SuperFuncionesGenericos.Interfaces.OperadorBinario;
import idat.v4_SuperFuncionesGenericos.Interfaces.Predicado;
import idat.v4_SuperFuncionesGenericos.Interfaces.Proveedor;;

public class SuperFunciones {

    public static <T> List<T> filtrar(List<T> valores,Predicado<T> predicado) {

        List<T> resultado = new ArrayList<>();
        for (T valor : valores) {
            if (predicado.test(valor)) { // soloPares(0)
                resultado.add(valor);
            }
        }
        return resultado;
    }

    public static <T> List<T> proveer(int cantidad, Proveedor<T> provee) {
        List<T> resultado = new ArrayList<>();
        for (int i = 0; i < cantidad; i++) {
            resultado.add(provee.obtener());
        }
        return resultado;
    }

    public static <T, R> List<R> transformar(List<T> lista, Funcion<T, R>  funcion) {
        List<R> resultado = new ArrayList<>();
        for (int i = 0; i < lista.size(); i++) {
            resultado.add(funcion.aplicar(lista.get(i)));
        }
        return resultado;
    }

    public static <T> List<T> actuar(List<T> valores, Consumidor<T> consumidor) {
        for (T valor : valores) {
            consumidor.aceptar(valor);
        }
        return valores;
    }

    public static <T> void consumir( List<T> valores, Consumidor<T> consumidor) {
        for (T valor : valores) {
            consumidor.aceptar(valor);
        }
    }

    public static <T> T reducir(List<T> valores, T identidad, OperadorBinario<T> funcionbinaria) {
        T total = identidad;
        for (T valor : valores) {
            total = funcionbinaria.aplicar(total, valor);
        }
        return total;
    }

}
