package model;

import java.time.LocalDate;

import Ejemplo.JsonAtributo;

public class Producto {
    
    @JsonAtributo
    private String nombre;

    @JsonAtributo
    private Long precio;

    private LocalDate fecha;
    
    public Producto(String nombre, Long precio, LocalDate fecha) {
        this.nombre = nombre;
        this.precio = precio;
        this.fecha = fecha;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getPrecio() {
        return precio;
    }

    public void setPrecio(Long precio) {
        this.precio = precio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    

}
