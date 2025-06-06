package modules;
import java.util.ArrayList;

public class Evento {
    public String nombre;
    public String fecha;
    public String lugar;
    public ArrayList<String> invitados;
    public static int cantidadEventos;

    public Evento(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = "no proporcionado";
        this.invitados = new ArrayList<>();
        cantidadEventos++;
    }

    public Evento(String nombre, String fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.lugar = lugar;
        this.invitados = new ArrayList<>();
        cantidadEventos++;
    }

    public void agregarInvitado(ArrayList<String> nuevosInvitados) {
        invitados.addAll(nuevosInvitados);
    }

    public void agregarInvitado(String Nombreinvitado) {
        invitados.add(Nombreinvitado);
    }

    public String mostrarInformacion() {
        return "Evento: " + nombre + " | fecha: " + fecha + " | lugar: " + lugar + " | invitados: " + invitados;
    }

    public static int mostrarCantidadEventos() {
        return cantidadEventos;
    }

}
