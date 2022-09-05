package idat.Ejercicios.modelos;

public class Curso implements Comparable<Curso>{

    private String titulo;
    private Float duracion; //Expresada en horas
    private int videos; //cantidad de vídeos
    private int alumnos; //Cantidad de alumnos

    public Curso(String titulo, Float duracion, int videos, int alumnos) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.videos = videos;
        this.alumnos = alumnos;
    }

    public Curso() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }

    public int getVideos() {
        return videos;
    }

    public void setVideos(int videos) {
        this.videos = videos;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    @Override
    public int compareTo(Curso o) {
        return duracion.compareTo(o.duracion);
    }

    @Override
    public String toString() {
        return "Curso [alumnos=" + alumnos + ", duracion=" + duracion + ", titulo=" + titulo + ", videos=" + videos
                + "]";
    }

    

}
