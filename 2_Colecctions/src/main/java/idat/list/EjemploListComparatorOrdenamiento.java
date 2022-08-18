
package idat.list;

import idat.modelo.Alumno;
import java.util.ArrayList;
//import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class EjemploListComparatorOrdenamiento {
    
    public static void main(String[] args) {
        
        List<Alumno> al = new ArrayList<>();

        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        
        // se puede agregar en una posicion difinida
        al.add(2, new Alumno("Jano", 7));
        al.set(3, new Alumno("Andres", 3));
        

        // ordenamiento con sort
        al.sort(Comparator.comparing((Alumno a) -> a.getNota()).reversed());
        
        
        al.forEach(h -> System.out.println(h));
        
        
    }
}
