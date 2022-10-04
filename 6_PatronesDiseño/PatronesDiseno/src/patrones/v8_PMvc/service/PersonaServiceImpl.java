package v8_PMvc.service;


import v8_PMvc.dao.PersonaDAO;
import v8_PMvc.model.Persona;

import java.util.List;

public class PersonaServiceImpl implements PersonaService{

	private PersonaDAO dao;
	
	public PersonaServiceImpl(PersonaDAO dao) {
		this.dao = dao;
	}
	
	@Override
	public List<Persona> listar() {
		return dao.listar();
	}

}
