package src.modules;

public abstract class Materia {
    private String nombre;
    private int creditos;
    private int[] calificaciones = new int[4];

    public Materia (){

    }

    public Materia(String nombre, int creditos){
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public Materia(String nombre, int creditos, int[] calificaciones){
        this.nombre = nombre;
        this.creditos = creditos;
        this.calificaciones = calificaciones;
    }


    public abstract int calcularCalificacion();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        this.calificaciones = calificaciones;
    }
}
