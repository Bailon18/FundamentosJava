package genericosClases;

public class Maquinaria {

    private String tipo;

    public Maquinaria(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Maquinaria [tipo=" + tipo + "]";
    }

    
}
