package idat.v2_SuperFuncionesClases.Clases;

import java.util.Random;

import idat.v2_SuperFuncionesClases.Interfaces.Proveedor;

public class ProAleatorio  implements Proveedor{

    Random random = new Random();

    @Override
    public Integer obtener() {
        
        return random.nextInt(100);
    }
    
}
