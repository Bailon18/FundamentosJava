package Ejemplo;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.Arrays;

import model.Producto;
import procesador.JsonSerializador;

public class EjemploAnotacion {
    
    public static void main(String[] args) {
        
        Producto pro = new Producto("mesa centro ROBLE", 10000L, LocalDate.now());
        System.out.println("Json: "+ JsonSerializador.convertirJson(pro));
    }
}
