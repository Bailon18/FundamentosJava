package repositorio;


import java.util.List;

import modelo.Cliente;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);
}
