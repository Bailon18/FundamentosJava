package v8_PMvc.controller;


import v8_PMvc.service.PersonaService;
import v8_PMvc.service.PersonaServiceImpl;

import java.io.Serializable;
import java.util.ArrayList;

@Named
@ViewScoped
public class PersonaController implements Serializable {

	private List<Persona> lista;
	private PersonaService service;
	private String motor;

	public PersonaController() {
		motor = "MYSQL";
		lista = new ArrayList<>();
		service = new PersonaServiceImpl(new PersonaDAOImpl(motor));
		listar();
	}

	public void listar() {
		lista = service.listar();
	}
	
	public void seleccionar(String motor) {
		service = new PersonaServiceImpl(new PersonaDAOImpl(motor));
		listar();
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}	

}
