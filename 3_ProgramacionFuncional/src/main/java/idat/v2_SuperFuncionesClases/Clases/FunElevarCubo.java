package idat.v2_SuperFuncionesClases.Clases;

import idat.v2_SuperFuncionesClases.Interfaces.Funcion;

public class FunElevarCubo implements Funcion{

    @Override
    public Integer aplicar(Integer valor) {
        return valor * 3;
    }
    
}
