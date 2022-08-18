
package idat.modelo;

import java.util.Date;

/**
 *
 * @author Bailon
 */
public class Vuelo {
    
    private String codigo;
    private String origen;
    private String destino;
    private Date fechaHora;
    private int numeroPasajero;

    public Vuelo() {
    }

    public Vuelo(String codigo, String origen, String destino, Date fechaHora, int numeroPasajero) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.fechaHora = fechaHora;
        this.numeroPasajero = numeroPasajero;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public int getNumeroPasajero() {
        return numeroPasajero;
    }

    public void setNumeroPasajero(int numeroPasajero) {
        this.numeroPasajero = numeroPasajero;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Vuelo{");
        sb.append("codigo=").append(codigo);
        sb.append(", origen=").append(origen);
        sb.append(", destino=").append(destino);
        sb.append(", fechaHora=").append(fechaHora);
        sb.append(", numeroPasajero=").append(numeroPasajero);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
}
