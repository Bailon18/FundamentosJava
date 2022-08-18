
package idat.list;

import idat.modelo.Alumno;
import java.util.ArrayList;
import java.util.List;


public class EjemploList {
    
    public static void main(String[] args) {
        
        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size = " + al.size());
        System.out.println("está vacía = " + al.isEmpty());
        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        
        // se puede agregar en una posicion difinida
        al.add(2, new Alumno("Jano", 7));
        al.set(3, new Alumno("Andres", 3));
        
        // size -> tamaño del arraylist
        //System.out.println(al + ", size = " + al.size());
        
        // remove(objecto)
        al.remove(new Alumno("Jano", 7));

        // contains(objeto) -> retornar bool si existe true < false
        //boolean b = al.contains(new Alumno("Cata", 6));
        //System.out.println("La lista contiene a Cata = " + b);

        Object a[] = al.toArray();
        for(int i=0; i<a.length;i++){
            //System.out.println("Desde el arreglo = " + a[i]);
        }
        
        
    }
}
