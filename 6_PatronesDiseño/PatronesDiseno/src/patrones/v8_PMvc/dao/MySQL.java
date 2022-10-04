package v8_PMvc.dao;

public class MySQL implements Conexion{

	@Override
	public void conectar() {
		System.out.println("Conexi�n a MYSQL");
	}

}
