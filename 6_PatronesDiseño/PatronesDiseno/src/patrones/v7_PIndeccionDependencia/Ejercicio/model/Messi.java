package v7_PIndeccionDependencia.Ejercicio.model;

import v7_PIndeccionDependencia.Ejercicio.dao.IEquipos;

public class Messi {
    private IEquipos equipo;

    public Messi(IEquipos equipo){
        this.equipo = equipo;
    }

    public void mostrarEquipo(){
        equipo.mostrarEquipo();
    }
}
