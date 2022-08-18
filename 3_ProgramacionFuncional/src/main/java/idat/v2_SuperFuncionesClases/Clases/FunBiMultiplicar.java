package idat.v2_SuperFuncionesClases.Clases;

import idat.v2_SuperFuncionesClases.Interfaces.FuncionBInaria;

public class FunBiMultiplicar implements FuncionBInaria {

    @Override
    public Integer aplicar(Integer total, Integer valor) {
        return total * valor;
    }
    
}
