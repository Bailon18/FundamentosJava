package idat.v11_Streams;

public class Descripcion {
    
    private final Integer value;

    public Descripcion(Integer value){
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "V[" + value + "]";
    }



}
