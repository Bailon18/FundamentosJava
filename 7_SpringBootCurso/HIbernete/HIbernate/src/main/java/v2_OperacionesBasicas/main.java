package v2_OperacionesBasicas;

import domain.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import v2_OperacionesBasicas.dao.CRUD;
import v2_OperacionesBasicas.dao.PersonaDAOImpl;

import java.util.List;

public class main {
    public static void main(String[] args) {

        CRUD<Persona> c1 = new PersonaDAOImpl();
        c1.listar();

        Persona  p = new Persona();
        p.setNombre("Alexis");
        p.setApellido("Luna Perez");
        p.setEmail("ale@gmail.com");
        p.setTelefono("999992828");

        c1.insertar(p);
        System.out.println("");
        c1.listar();
    }
}
