package src.app;
import src.modules.*;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<estudianteUniversitario> estudiantesUniversitarios = new ArrayList<>();

        estudianteUniversitario estudiante1 = new estudianteUniversitario();
        estudiante1.agregarMateria(new materiaPractica("matematicas", 35));
        //estudiante1.agregarMateria();

    }
}
