
package idat.ejercicio;

import idat.modelo.Vuelo;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


/**
 *
 * @author Bailon
 */
public class EjercicioPropuesto {
    
    
    public static void main(String[] args) {
        
        
        List<Vuelo> vuelos = new ArrayList<>();
        
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm");
        
        try {
            
            vuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", df.parse("2021-08-31 04:45"), 47));
            vuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", df.parse("2021-08-30 16:00"), 52));
            vuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", df.parse("2021-08-29 13:22"), 59));
            vuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", df.parse("2021-08-31 14:05"), 25));
            vuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", df.parse("2021-08-31 05:20"), 29));
            vuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", df.parse("2021-08-30 08:45"), 55));
            vuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", df.parse("2021-08-29 07:41"), 51));
            vuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", df.parse("2021-08-30 10:35"), 48));
            vuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", df.parse("2021-08-29 09:14"), 59));
            vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", df.parse("2021-08-31 08:33"), 31));
            vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", df.parse("2021-08-31 15:15"), 29));
            vuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", df.parse("2021-08-30 08:14"), 47));
            vuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", df.parse("2021-08-29 22:53"), 60));
            vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", df.parse("2021-08-31 09:57"), 32));
            vuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago", df.parse("2021-08-31 04:00"), 35));
            vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", df.parse("2021-08-29 07:45"), 61));
            vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", df.parse("2021-08-30 07:12"), 58));
            vuelos.add(new Vuelo("LAT 501", "París", "Santiago", df.parse("2021-08-29 18:29"), 49));
            vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", df.parse("2021-08-30 15:45"), 39));

            
            
            vuelos.sort(Comparator.comparing((Vuelo v) -> v.getFechaHora()));
            
            System.out.println("Listado ordenado por fecha llegada accedente");
            vuelos.forEach(c -> System.out.println(c));
            
            
            System.out.println("El ultimo vuelo es: ");
            vuelos.sort(Comparator.comparing((Vuelo v) -> v.getFechaHora()).reversed());
            System.out.println(vuelos.get(0));
            
            System.out.println("El vuelo con menor número de pasajeros es ");
            vuelos.sort(Comparator.comparing((Vuelo v) -> v.getNumeroPasajero()));
            System.out.println(vuelos.get(0));
            
            
        } catch (ParseException ex) {
           
        }

        
    }
}
