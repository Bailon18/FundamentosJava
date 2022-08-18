
package idat.list;

import idat.modelo.Alumno;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;


public class FormasIteracion {
    
    public static void main(String[] args) {
        
        
        iteracionARRAYLIST();

        
        // iteraacion con has
        
    }
    
    public static void iteracionHASHSET(){
        
        // lista sin ordenar y no repetitivos
        // no se puede iterar por for clasico
        
        Set<Alumno> al = new HashSet<>();
        System.out.println(al + ", size = " + al.size());
        System.out.println("está vacía = " + al.isEmpty());
        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        
        // foreach
        for(Alumno a: al){
            System.out.println(a);
        }
        
        System.out.println("");
        
        // iterator
        Iterator<Alumno> it = al.iterator();
        while(it.hasNext()){
            Alumno alu = it.next();
            System.out.println(alu);
        }
        
        System.out.println("");
        // lambda
        al.forEach(a -> System.out.println(a));
    }
    
    public static void iteracionARRAYLIST(){
        
        // lista ordenada segun la ingreso
      
        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size = " + al.size());
        System.out.println("está vacía = " + al.isEmpty());
        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        
        for(int i= 0; i<al.size(); i++){
            System.out.println(al.get(i));
        }
        
        System.out.println("");
        
        // foreach
        for(Alumno a: al){
            System.out.println(a);
        }
        
        System.out.println("");
        
        // iterator
        Iterator<Alumno> it = al.iterator();
        while(it.hasNext()){
            Alumno alu = it.next();
            System.out.println(alu);
        }
        
        System.out.println("");
        // lambda
        al.forEach(a -> System.out.println(a));
    }
}
