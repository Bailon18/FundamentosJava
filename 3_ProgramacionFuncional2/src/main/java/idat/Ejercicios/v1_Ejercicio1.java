package idat.Ejercicios;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


import idat.Ejercicios.modelos.Curso;

public class v1_Ejercicio1 {
    

    public v1_Ejercicio1(){

        List<Curso> cursos = new ArrayList<>();
        cursos.add(new Curso("Cursos profesional de Java", 6.5f, 50, 200 ));
        cursos.add(new Curso("Cursos profesional de Python", 8.5f, 60, 800 ));
        cursos.add(new Curso("Cursos profesional de DB", 4.5f, 70, 700 ));
        cursos.add(new Curso("Cursos profesional de Android", 7.5f, 10, 400 ));
        cursos.add(new Curso("Cursos profesional de Escritura", 1.5f, 10, 300 ));

        /* 
            Obtener la cantidad de cursos con una duración mayor a 5 horas. *
            Obtener la cantidad de cursos con una duración menor a 2 horas. *
            Listar el título de todos aquellos cursos con una cantidad de vídeos mayor a 50. *
            Mostrar en consola el título de los 3 cursos con mayor duración. *
            Mostrar en consola la duración total de todos los cursos. *
            Mostrar en consola todos aquellos libros que superen el promedio en cuanto a duración se refiere. *
            Mostrar en consola la duración de todos aquellos cursos que tengan una cantidad de alumnos inscritos menor a 500. *
            Obtener el curso con mayor duración. *
            Crear una lista de Strings con todos los titulos de los cursos.*
        */


        long resultado = cursos.stream()
                .filter(c -> c.getDuracion() > 5)
                .count();
        System.out.println("Cantidad de cursos duracion > 5: " + resultado);

        
        long resultado2 = cursos.stream()
                .filter(c -> c.getDuracion() < 2)
                .count();
        System.out.println("Cantidad de cursos duracion < 2: " + resultado2);


        List<String> resultado3 = cursos.stream()
                .filter(c -> c.getVideos() > 50)
                .map(cur -> cur.getTitulo())
                .collect(Collectors.toList());
        System.out.println("Lista Titulos: "+resultado3);


        List<String> resultado4 = cursos.stream()
                .sorted((a, b) -> b.compareTo(a))
                .map(cur -> cur.getTitulo())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Lista de 3 Titulos mayor duracion: "+resultado4);
        

        double resultado5 = cursos.stream()
                .mapToDouble(Curso::getDuracion)
                .reduce(
                0, // identidad
                (acumulador, valor) -> acumulador + valor);// acumulador
        System.out.println("Cantidad total duracion: "+resultado5);


        double promedio = cursos.stream()
                .mapToDouble(Curso::getDuracion)
                .average()
                .orElse(0.0);
        System.out.println("Promedio de duracion:  "+promedio);


        List<Curso> resultado6 = cursos.stream()
                .filter(c -> c.getDuracion() > promedio)
                .collect(Collectors.toList());
            
        System.out.println("Cursos Mayor al promedio:  "+resultado6);


        List<Curso> resultado7 = cursos.stream()
                .filter(c -> c.getAlumnos() < 500)
                .collect(Collectors.toList());
        
        System.out.println("Cantidad de alumnos inscritos menor a 500:  "+resultado7);


        Curso resultado8 = cursos.stream()
            .collect(Collectors.maxBy(Comparator.naturalOrder()))
            .orElse(new Curso());
        
        System.out.println("Curso con maxima duracion: "+resultado8);


        List<String> resultado9 = cursos.stream()
            .map(Curso::getTitulo)
            .collect(Collectors.toList());
        
        System.out.println("lista de cursos(Titulo): "+resultado9);
          

    }

    public static void main(String[] args) {
        new v1_Ejercicio1();
    }
}
