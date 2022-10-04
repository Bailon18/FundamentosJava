package v7_PIndeccionDependencia.dao;


import v7_PIndeccionDependencia.model.Persona;

public interface PersonaDAO extends CRUD<Persona>{

	void mostrarNombre();
	void setConexion(IConexion conexion);
	
}
