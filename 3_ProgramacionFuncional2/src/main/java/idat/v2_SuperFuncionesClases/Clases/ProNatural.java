package idat.v2_SuperFuncionesClases.Clases;

import idat.v2_SuperFuncionesClases.Interfaces.Proveedor;

public class ProNatural implements Proveedor {

    public Integer numero = 0; 

    @Override
    public Integer obtener() {
        
        return numero ++ ;
    }
    
}
