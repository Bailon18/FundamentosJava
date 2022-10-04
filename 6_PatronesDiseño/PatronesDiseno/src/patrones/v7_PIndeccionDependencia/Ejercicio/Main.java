package v7_PIndeccionDependencia.Ejercicio;

import v7_PIndeccionDependencia.Ejercicio.model.Barcelona;
import v7_PIndeccionDependencia.Ejercicio.model.Juventus;
import v7_PIndeccionDependencia.Ejercicio.model.Messi;

public class Main {

    public static void main(String[] args) {

        Messi m = new Messi(new Barcelona());
        m.mostrarEquipo();

        Messi m2 = new Messi(new Juventus());
        m2.mostrarEquipo();


    }
}
