package idat.v2_SuperFuncionesClases.Clases;

import idat.v2_SuperFuncionesClases.Interfaces.Predicado;

public class SoloImpares implements Predicado {

    @Override
    public boolean test(Integer valor) {
        return valor % 2 != 0;
    }
    
}
