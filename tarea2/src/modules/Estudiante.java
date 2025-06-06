package modules;

import java.util.ArrayList;

public class Estudiante {
    public String nombre;
    public String matricula;
    public String carrera;
    public ArrayList<String> materias;
    public static int EstudiantesCreados;

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.materias = new ArrayList<>();
        this.carrera = "no disponible";
        EstudiantesCreados++;
    }

    public Estudiante(String nombre, String matricula, String carrera) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.carrera = carrera;
        this.materias = new ArrayList<>();
        EstudiantesCreados++;
    }

    public void agregarMateria(ArrayList<String> nuevasAsignaturas){
        this.materias.addAll(nuevasAsignaturas);
    }

    public void agregarMateria(String materia) {
        this.materias.add(materia);
    }

    public String MostrarInformacion() {
        return "Estudiante: " + nombre + " | matricula: " + matricula + " | carrera: " + carrera + " | materias: " + materias;
    }

    public static int cantidadEstudiantes() {
        return EstudiantesCreados;
    }

}
