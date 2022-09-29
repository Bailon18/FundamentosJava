package v2_PCreacion_Factory.inter.impl;


import v2_PCreacion_Factory.inter.IConexion;

public class ConexionVacia implements IConexion {

	@Override
	public void conectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

	@Override
	public void desconectar() {
		System.out.println("NO SE ESPECIFIC� PROVEEDOR");		
	}

}
