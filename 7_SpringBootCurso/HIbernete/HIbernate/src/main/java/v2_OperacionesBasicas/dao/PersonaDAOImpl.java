package v2_OperacionesBasicas.dao;

import domain.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

import java.util.List;

public class PersonaDAOImpl implements PersonaDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDAOImpl(){
        emf = Persistence.createEntityManagerFactory("HibernateEjemplo1");
        em = emf.createEntityManager();
    }

    @Override
    public void listar() {
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);
        query.getResultList().forEach(System.out::println);
    }

    @Override
    public void insertar(Persona persona) {
        em.getTransaction().begin(); // iniciamos nuestra transacion
        em.persist(persona);
        em.getTransaction().commit();
    }

    @Override
    public Persona consultarPorId(int id) {
        return null;
    }

    @Override
    public void actualizar(Persona persona) {

    }

    @Override
    public void eliminar(int id) {

    }

}
