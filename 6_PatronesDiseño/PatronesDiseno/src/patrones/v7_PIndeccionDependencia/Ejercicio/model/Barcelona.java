package v7_PIndeccionDependencia.Ejercicio.model;

import v7_PIndeccionDependencia.Ejercicio.dao.IEquipos;

public class Barcelona implements IEquipos {

    @Override
    public void mostrarEquipo() {
        System.out.println("FC BARCELONA");
    }
}
