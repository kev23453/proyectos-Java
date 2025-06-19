package src.modules;
import src.interfaces.Estudiante;
import java.util.ArrayList;

public class estudianteUniversitario implements Estudiante {
    private ArrayList<Materia> materiasEstudiante = new ArrayList<>();

    @Override
    public void agregarMateria(Materia materia) {
        materiasEstudiante.add(materia);
    }

    @Override
    public double calcularPromedio() {
        int suma = 0;

        for (Materia materia : materiasEstudiante) {
            int calificacion = materia.calcularCalificacion();
            suma += calificacion;
            System.out.println("Calificación de " + materia.getNombre()
                    + " = " + calificacion);
        }

        double promedioGeneral = suma / materiasEstudiante.size();

        return (double) promedioGeneral;
    }
}
