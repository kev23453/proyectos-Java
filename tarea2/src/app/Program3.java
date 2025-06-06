package app;
import modules.Estudiante;
import java.util.ArrayList;

public class Program3 {
    public static void main(String[] args) {

        // vacio por ahora
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

        Estudiante estudiante1 = new Estudiante("kevin", "2024-5480");
        estudiante1.agregarMateria("Calculo diferencial");

        Estudiante estudiante2 = new Estudiante("Carlitos", "2020-2824", "Ingenieria en software");
        ArrayList<String> materiasCarlos = new ArrayList<>();
        materiasCarlos.add("Probabilidad y Estadistica");
        materiasCarlos.add("Programacion 1");
        materiasCarlos.add("Analisis y diseño de sistemas");
        estudiante2.agregarMateria(materiasCarlos);

        Estudiante estudiante3 = new Estudiante("Esmeralda", "2023-0554", "Ciberseguridad");
        estudiante3.agregarMateria("enrutamiento");

        listaEstudiantes.add(estudiante1);
        listaEstudiantes.add(estudiante2);
        listaEstudiantes.add(estudiante3);

        System.out.println("========== Lista de los Estudiantes =========");
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante.MostrarInformacion());
        }

    }
}
