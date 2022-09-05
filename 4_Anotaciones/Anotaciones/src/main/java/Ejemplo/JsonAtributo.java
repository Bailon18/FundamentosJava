package Ejemplo;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented

/* donde se va aplicar 

 FIELD = atributo
 CONSTRUCTOR -> constructor
 METHOD -> metodo
 TYPE -> clase

*/
@Target(ElementType.FIELD) 

/* En que contexto

CLASS -> tiempo de compilacion
RUNTIME -> tiempo de ejecucion

*/
@Retention(RetentionPolicy.RUNTIME) 
public @interface JsonAtributo {
    
    String nombre() default  "";
}
