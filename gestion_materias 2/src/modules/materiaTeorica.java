package src.modules;

public class materiaTeorica extends Materia {
    public materiaTeorica(String nombre, int creditos) {
        super(nombre, creditos);
    }

    @Override
    public int calcularCalificacion() {
        int[] calificaciones = getCalificaciones();
        return (calificaciones[0] + calificaciones[1] + calificaciones[2]) / 3;
    }

}
