package v3_PAbstractFactory;

import v3_PAbstractFactory.inter.FabricaAbstracta;
import v3_PAbstractFactory.inter.interfaces.IConexionBD;
import v3_PAbstractFactory.inter.interfaces.IConexionREST;
import v3_PAbstractFactory.inter.impl.ConexionRESTCompras;
import v3_PAbstractFactory.inter.impl.ConexionRESTNoArea;
import v3_PAbstractFactory.inter.impl.ConexionRESTVentas;

;

public class ConexionRESTFabrica implements FabricaAbstracta {

	@Override
	public IConexionREST getREST(String area) {
		if (area == null) {
			return new ConexionRESTNoArea();
		}
		if (area.equalsIgnoreCase("COMPRAS")) {
			return new ConexionRESTCompras();
		} else if (area.equalsIgnoreCase("VENTAS")) {
			return new ConexionRESTVentas();
		}

		return new ConexionRESTNoArea();
	}

	@Override
	public IConexionBD getBD(String motor) {
		return null;
	}
}
