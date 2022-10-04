package v5_PEstructural_Facade;

/* Patron facade -> patron estructural el cual su único objetivo es ocultar o simplificar la complejidad
que pueda tener nuestra aplicación para que el cliente simplemente pueda tener un punto de acceso muy fácil
y poder utilizar nuestro sistema sin que él sepa que es lo que hay por dentro
*/

import v5_PEstructural_Facade.facade.CheckFacade;

public class App {
	
	public static void main(String[] args) {
		CheckFacade cliente1 = new CheckFacade();
		cliente1.buscar("02/07/2018", "08/07/2018", "Lima", "Canc�n");
		
		CheckFacade cliente2 = new CheckFacade();
		cliente2.buscar("02/07/2018", "08/07/2018", "Lima", "Quito");
	}

}
