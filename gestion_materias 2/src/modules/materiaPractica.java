package src.modules;

public class materiaPractica extends Materia {
    public materiaPractica(String nombre, int creditos) {
        super(nombre, creditos);
    }

    @Override
    public int calcularCalificacion() {
        int[] calificaciones = getCalificaciones();
        return (int)(calificaciones[0] * 0.4 + calificaciones[1] * 0.4 + calificaciones[2] * 0.2);
    }
}
