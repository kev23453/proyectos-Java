package src.modules;

import src.interfaces.Estudiante;
import java.util.ArrayList;

public class estudianteUniversitario implements Estudiante {
    private ArrayList<materia> materiasEstudiante = new ArrayList<>();

    @Override
    public void agregarMateria(materia materia) {
        materiasEstudiante.add(materia);
    }

    @Override
    public void calcularPromedio() {

    }
}
