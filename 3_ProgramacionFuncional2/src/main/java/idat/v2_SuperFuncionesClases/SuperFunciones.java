package idat.v2_SuperFuncionesClases;

import java.util.ArrayList;
import java.util.List;

import idat.v2_SuperFuncionesClases.Interfaces.Consumidor;
import idat.v2_SuperFuncionesClases.Interfaces.Funcion;
import idat.v2_SuperFuncionesClases.Interfaces.FuncionBInaria;
import idat.v2_SuperFuncionesClases.Interfaces.Predicado;
import idat.v2_SuperFuncionesClases.Interfaces.Proveedor;;

public class SuperFunciones {

    public static List<Integer> filtrar(List<Integer> valores,
            Predicado predicado) {

        List<Integer> resultado = new ArrayList<>();

        for (Integer valor : valores) {

            if (predicado.test(valor)) { // soloPares(0)
                resultado.add(valor);
            }
        }

        return resultado;

    }

    public static List<Integer> proveer(int cantidad, Proveedor provee) {

        List<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < cantidad; i++) {
            resultado.add(provee.obtener());
        }

        return resultado;
    }

    public static List<Integer> convertir(List<Integer> lista, Funcion funcion) {

        List<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++) {

            resultado.add(funcion.aplicar(lista.get(i)));

        }
        return resultado;

    }

    public static List<Integer> actuar(List<Integer> valores, Consumidor consumidor) {

        for (Integer valor : valores) {

            consumidor.aceptar(valor);
        }
        return valores;
    }

    public static void consumir(List<Integer> valores, Consumidor consumidor) {
        
        for (Integer valor : valores) {
            consumidor.aceptar(valor);
        }
    }


    public static Integer reducir(List<Integer> valores, Integer identidad,
                                                 FuncionBInaria funcionbinaria){

            int total = identidad;
            for (Integer valor : valores) {
                total = funcionbinaria.aplicar(total, valor);
            }     
            return total;                      
    }

}
