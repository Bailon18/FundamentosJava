package repositorio;


import java.util.List;

import modelo.Cliente;

public interface PaginableRepositorio {
    List<Cliente> listar(int desde, int hasta);
}
