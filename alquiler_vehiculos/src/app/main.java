package src.app;
import src.modules.*;

public class main {
    public static void main(String[] args) {
        agenciaAlquiler agencia = new agenciaAlquiler();

        agencia.agregarVehiculo(new auto("158587489", 2025));
        agencia.agregarVehiculo(new camioneta("158922885", "G-wagon", 2021));

        agencia.menu();
    }
}
