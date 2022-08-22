package idat.v6_Lambdas.Interfaces;

@FunctionalInterface
public interface FuncionBInaria<T, U, R>  {
    
    R aplicar(U total, T valor);
}
