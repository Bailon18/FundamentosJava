package v6_PDAO;

import v6_PDAO.dao.CRUD;
import v6_PDAO.dao.PersonaDAOImpl;
import v6_PDAO.model.Persona;


 /* Patron DAO  -> puedes abstraer la logica de acceso de un conjunto de operaciones (interface genericas)9*/
public class App {
	
	public static void main(String[] args) {
		CRUD<Persona> dao = new PersonaDAOImpl();
		dao.listarTodos().forEach(x -> System.out.println(x.getNombres()));
		
		Persona per = new Persona();
		per.setNombres("MitoCode");
		dao.registrar(per);
	}

}
