
package Main;


import model.BolsaSupermecado;
import model.Fruta;
import model.Lacteo;
import model.Limpieza;
import model.NoPerecible;

public class Main {

    public static void main(String[] args) {
        

        BolsaSupermecado<Fruta> bolsaFruta = new BolsaSupermecado<>(5);
        bolsaFruta.addProducto(new Fruta("Manzana", 2.3, 1.2, "Rojo"));
        bolsaFruta.addProducto(new Fruta("Pera", 2.1, 1.8, "Verde"));
        bolsaFruta.addProducto(new Fruta("Pacay", 3.4, 2.0, "Verde"));
        bolsaFruta.addProducto(new Fruta("Fresa", 4.3, 2.0, "Rojo"));
        bolsaFruta.addProducto(new Fruta("Platanos", 1.0, 3.4, "Amarillo"));
        
        for (Fruta fru : bolsaFruta.getProductos()) {
            System.out.println("Nombre: "+ fru.getNombre()+"  Precio: " + fru.getPrecio()
                            + "  Peso: " + fru.getPeso() +"  Color: " + fru.getColor());
        }


        BolsaSupermecado<Lacteo> bolsaLacteo = new BolsaSupermecado<>(5);
        bolsaLacteo.addProducto(new Lacteo("Yogurt", 2.3, 1, 12));
        bolsaLacteo.addProducto(new Lacteo("Leche", 2.1, 1, 34));
        bolsaLacteo.addProducto(new Lacteo("Queso", 3.4, 2, 56));
        bolsaLacteo.addProducto(new Lacteo("Mantequilla", 4.3, 2, 12));
        bolsaLacteo.addProducto(new Lacteo("Leche bonle", 1.0, 3, 34));


        for (Lacteo lac : bolsaLacteo.getProductos()) {
            System.out.println("Nombre: "+ lac.getNombre()+"  Precio: " + lac.getPrecio()
                            + "  Cantidad: " + lac.getCantidad() +"  Proteinas: " + lac.getProteinas());
        }

        BolsaSupermecado<Limpieza> bolsaLimpieza= new BolsaSupermecado<>(5);
        bolsaLimpieza.addProducto(new Limpieza("Lejia", 4.3, "Componentes1", 1.0));
        bolsaLimpieza.addProducto(new Limpieza("LimpiaTodo", 4.3, "Componentes2", 2.4));
        bolsaLimpieza.addProducto(new Limpieza("Ambientador", 4.3, "Componentes3", 4.3));
        bolsaLimpieza.addProducto(new Limpieza("LimpiaTodo2", 4.3, "Componentes4", 1.5));
        bolsaLimpieza.addProducto(new Limpieza("Lehia2", 4.3, "Componentes5", 1.3));


        for (Limpieza lim : bolsaLimpieza.getProductos()) {
            System.out.println("Nombre: "+ lim.getNombre()+"  Precio: " + lim.getPrecio()
                            + "  Componentes: " + lim.getComponentes() +"  Litros: " + lim.getLitros());
        }

        BolsaSupermecado<NoPerecible> bolsaNopere= new BolsaSupermecado<>(5);
        bolsaNopere.addProducto(new NoPerecible("Harina", 4.3, 1, 1));
        bolsaNopere.addProducto(new NoPerecible("Maicena", 4.3, 2, 2));
        bolsaNopere.addProducto(new NoPerecible("Arroz", 4.3, 3, 4));
        bolsaNopere.addProducto(new NoPerecible("Pastas", 4.3, 4, 1));
        bolsaNopere.addProducto(new NoPerecible("Café", 4.3, 5, 1));


        for (NoPerecible nopere : bolsaNopere.getProductos()) {
            System.out.println("Nombre: "+ nopere.getNombre()+"  Precio: " + nopere.getPrecio()
                            + "  Componentes: " + nopere.getContenido() +"  Litros: " + nopere.getCalorias());
        }

    }
}

