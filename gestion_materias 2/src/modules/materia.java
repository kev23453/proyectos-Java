package src.modules;

public abstract class materia {
    private String nombre;
    private int creditos;

    public materia(String nombre, int creditos){
        this.nombre = nombre;
        this.creditos = creditos;
    }
    public abstract void calcularCalificacion();
}
