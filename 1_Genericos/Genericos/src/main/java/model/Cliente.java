package model;

public class Cliente extends BaseEntity {

    private String nombre;
    private String apellidos;


    public Cliente(String nombre, String apellidos) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
       
    }

    public Cliente() {
        //this.id = ++ultimoid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public String toString() {
        return "id=" + super.getId() + ", apellidos=" + apellidos + ", nombre=" + nombre;
    }


    

}
