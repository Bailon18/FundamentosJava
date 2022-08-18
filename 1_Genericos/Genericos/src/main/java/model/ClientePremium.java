package model;

public class ClientePremium extends Cliente implements Comparable<ClientePremium>{ 

    
    public ClientePremium(String nombre, String apellidos) {
        super(nombre, apellidos);
    }

    @Override
    public int compareTo(ClientePremium arg0) {
        return 0;
    }

}
