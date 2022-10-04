package v3_PAbstractFactory.inter.impl;


import v3_PAbstractFactory.inter.interfaces.IConexionBD;

public class ConexionVacia implements IConexionBD {

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

}
