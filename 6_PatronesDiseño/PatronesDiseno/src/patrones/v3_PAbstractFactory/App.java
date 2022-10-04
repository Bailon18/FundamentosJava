package v3_PAbstractFactory;

// AbstractFactory --> fabrica de fabricas

import v3_PAbstractFactory.inter.FabricaAbstracta;
import v3_PAbstractFactory.inter.interfaces.IConexionBD;
import v3_PAbstractFactory.inter.interfaces.IConexionREST;

public class App {

	public static void main(String[] args) {

		FabricaAbstracta fabricaBD = FabricaProductor.getFactory("BD");

		IConexionBD cxBD1 = fabricaBD.getBD("MYSQL");

		cxBD1.conectar();

		FabricaAbstracta fabricaREST = FabricaProductor.getFactory("REST");
		IConexionREST cxRS1 = fabricaREST.getREST("COMPRAS");

		cxRS1.leerURL("https://www.youtube.com/subscription_center?add_user=mitocode");
	}

}
