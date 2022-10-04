package v7_PIndeccionDependencia;


import v7_PIndeccionDependencia.dao.*;

/*
* Inyección de dependencia -> se puede hacer via constructor o un methods
* es para desaclopar la creacion de una instancia directamente en la clase receptora
*
* */

public class App {

	public static void main(String[] args) {

		IConexion cx1 = new ConexionMySQL("mitocode", "7482", "localhost");
		IConexion cx2 = new ConexionPostgre("mitocode", "7482", "192.168.1.1");

		PersonaDAO dao = new PersonaDAOImpl();
		dao.setConexion(cx1);
		dao.listarTodos();

	}
}
