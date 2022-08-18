package repositorio.lista;

import java.util.ArrayList;
import java.util.List;

import model.Producto;
import repositorio.AbstractaListRepositorio;
import repositorio.Direccion;

public class ProductoListRepositorio extends AbstractaListRepositorio<Producto>{

    @Override
    public List<Producto> listar(String campo, Direccion dir) {
        
        List<Producto> listaOrdenada = new ArrayList<>(this.dataSource);

        listaOrdenada.sort((a, b) -> {
                int resultado = 0;

                if(dir == Direccion.ASC){
                    resultado = ordenar(campo, a, b);
                } else if(dir == Direccion.DESC){
                    resultado = ordenar(campo, b, a);
                }
                return resultado;
        });
        return listaOrdenada;
    }

    @Override
    public void editar(Producto producto) {
        Producto p  = porId(producto.getId());
        p.setDescripcion(producto.getDescripcion());
        p.setPrecio(producto.getPrecio());
    }

    public static int ordenar(String campo, Producto a, Producto b){
        int resultado = 0;
        switch (campo){
            case "id" ->
                    resultado = a.getId().compareTo(b.getId());
            case "descripcion" ->
                    resultado = a.getDescripcion().compareTo(b.getDescripcion());
            case "precio" ->
                    resultado = a.getPrecio().compareTo(b.getPrecio());
        }
        return resultado;
    }
    
}
