package idat.v6_Lambdas.Interfaces;

@FunctionalInterface
public interface Consumidor<T>  {
    
    void aceptar(T valor);

}
