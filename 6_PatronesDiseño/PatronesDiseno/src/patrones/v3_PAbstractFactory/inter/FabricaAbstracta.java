package v3_PAbstractFactory.inter;

import v3_PAbstractFactory.inter.interfaces.IConexionBD;
import v3_PAbstractFactory.inter.interfaces.IConexionREST;

public interface FabricaAbstracta {

	IConexionBD getBD(String motor);
	IConexionREST getREST(String area);
	
}
