package v1_Ejemplo1;

import domain.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class main {
    public static void main(String[] args) {

        String hql = "SELECT p FROM Persona p";

        EntityManagerFactory fabrica = 
                Persistence.createEntityManagerFactory("HibernateEjemplo1");

        EntityManager entityManager = fabrica.createEntityManager();

        Query query = entityManager.createQuery(hql);

        List personas = query.getResultList();

        personas.forEach(System.out::println);
    }
}
