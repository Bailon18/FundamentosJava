package v3_PAbstractFactory.inter.impl;


import v3_PAbstractFactory.inter.interfaces.IConexionREST;

public class ConexionRESTNoArea implements IConexionREST {

	@Override
	public void leerURL(String url) {
		System.out.println("AREA NO ELEGIDA");
	}

}
