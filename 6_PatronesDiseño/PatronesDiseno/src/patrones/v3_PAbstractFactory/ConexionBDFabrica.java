package v3_PAbstractFactory;


import v3_PAbstractFactory.inter.FabricaAbstracta;
import v3_PAbstractFactory.inter.interfaces.IConexionBD;
import v3_PAbstractFactory.inter.interfaces.IConexionREST;
import v3_PAbstractFactory.inter.impl.*;

public class ConexionBDFabrica implements FabricaAbstracta {

	@Override
	public IConexionBD getBD(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}
		if (motor.equalsIgnoreCase("MYSQL")) {
			return new ConexionMySQL();
		} else if (motor.equalsIgnoreCase("ORACLE")) {
			return new ConexionOracle();
		} else if (motor.equalsIgnoreCase("POSTGRE")) {
			return new ConexionPostgreSQL();
		} else if (motor.equalsIgnoreCase("SQL")) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}

	@Override
	public IConexionREST getREST(String area) {
		return null;
	}
}
