package v8_PMvc.dao;

public class PostgreSQL implements Conexion{

	@Override
	public void conectar() {
		System.out.println("Conexi�n a POSTGRESQL");
	}

}
