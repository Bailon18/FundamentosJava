package repositorio;


import java.util.List;

import model.Producto;
import repositorio.lista.ProductoListRepositorio;


public class EjemploRepositorioProducto{
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
        repo.crear(new Producto("Mesa", 50.23));
        repo.crear(new Producto("Silla", 18.0));
        repo.crear(new Producto("Lampara", 15.3));
        repo.crear(new Producto("Notebook", 400.40));

        List<Producto> pro = repo.listar();
        pro.forEach(System.out::println);
        
        System.out.println("===== paginable =====");
        List<Producto> paginable = repo.listar(1, 4);
        paginable.forEach(System.out::println);

        System.out.println("===== ordenar Ascendente =====");
        List<Producto> productoOrdenAsc = repo.listar("id", Direccion.ASC);
        for(Producto c: productoOrdenAsc){
            System.out.println(c);
        }

        System.out.println("===== editar =====");
        Producto beaActualizar = new Producto("Mesa Mesa", 50.23);
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Producto bea = repo.porId(2);
        System.out.println(bea);
        
        System.out.println("===== ordenar Descendente =====");
        repo.listar("descripcion", Direccion.ASC).forEach(System.out::println);


        System.out.println("===== eliminar ======");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);
        System.out.println("===== total ===== ");
        System.out.println("Total registros: " + repo.total());
    }
}
