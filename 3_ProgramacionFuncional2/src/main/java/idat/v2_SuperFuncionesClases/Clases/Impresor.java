package idat.v2_SuperFuncionesClases.Clases;

import idat.v2_SuperFuncionesClases.Interfaces.Consumidor;

public class Impresor implements Consumidor{

    @Override
    public void aceptar(Integer valor) {
        System.out.println(valor);
    }
    
}
