package v2_PCreacion_Factory;

import v2_PCreacion_Factory.inter.IConexion;


/*
* Es cuando tenemos una clase padre o una interfaz tiene muchas implementaciones
* delegando la creación de las instancias a una clase fabrica
* la cual se encargara de crear la instancia en particular y nuestra clase main de ejemplo hará uso de esta fabrica
*  olvidandonos de la complejidad para crearla.
* */
public class App {

	public static void main(String[] args) {

		ConexionFabrica fabrica = new ConexionFabrica();

		IConexion cx1 = fabrica.getConexion("ORACLE");
		cx1.conectar();
		cx1.desconectar();

		IConexion cx2 = fabrica.getConexion("MYSQL");
		cx2.conectar();
		cx2.desconectar();

		IConexion cx3 = fabrica.getConexion("H2");
		cx3.conectar();
		cx3.desconectar();
	}
}
