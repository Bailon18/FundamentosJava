/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package idat.list;

import idat.modelo.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Bailon
 */
public class EjemploListIterator {
    
    public static void main(String[] args) {
        
        /*
            hasNext() -> asi adelante
            hasPrevious -> asi atras
        */
        
        List<Alumno> al = new ArrayList<>();

        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        
        // se puede agregar en una posicion difinida
        al.add(2, new Alumno("Jano", 7));
        al.set(3, new Alumno("Andres", 3));
        
        ListIterator<Alumno>  li = al.listIterator();
        
        while (li.hasNext()) {
            Alumno alumno = li.next();
            System.out.println(alumno);
            
        }
        
        System.out.println(" ");
        
        while (li.hasPrevious()) {
            Alumno alumno = li.previous();
            System.out.println(alumno);
            
        }
        
        
               
    }
}
