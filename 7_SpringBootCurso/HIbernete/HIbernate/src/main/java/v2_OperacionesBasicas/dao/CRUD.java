package v2_OperacionesBasicas.dao;

import java.util.List;

public interface CRUD<T> {

    void listar();
    void insertar(T t);
    T consultarPorId(int id);
    void actualizar(T t);
    void eliminar(int id);
}
