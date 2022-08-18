package model;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermecado<T> {
    
    private List<T> listaProductos;
    private int maximoPro;

    public BolsaSupermecado(int max) {
        this.listaProductos = new ArrayList<>();
        this.maximoPro = max;
    }

    public void addProducto(T pro){
        if(listaProductos.size()+1 <= maximoPro){
            listaProductos.add(pro);
        }else{
            throw new RuntimeException("No hay mas espacio");
        }
    }

    public List<T> getProductos(){
        return this.listaProductos;
    }

}
