package app;
import modules.Evento;
import java.util.Scanner;
import java.util.ArrayList;

public class Program2 {
    public static void main(String[] args) {

        ArrayList<String> invitados = new ArrayList<>();
        ArrayList<Evento> eventos = new ArrayList<>();
        Scanner scanner1 = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- MENÚ DE OPCIONES ---");
            System.out.println("1. Agregar evento");
            System.out.println("2. Ver todos los eventos");
            System.out.println("3. Mostrar eventos por fecha");
            System.out.println("4. Mostrar eventos por lugar");
            System.out.println("5. Mostrar eventos de un lugar específico");
            System.out.println("6. Ver cantidad de eventos");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner1.nextInt();
            scanner1.nextLine();

            switch (opcion) {
                case 1:
                    Evento evento; // colocandolo aqui para poder usarlo fuera del bloque de las instrucciones
                    System.out.println("Nombre del evento: ");
                    String nombreEvento = scanner1.nextLine();
                    System.out.println("Fecha del evento, colocar en formato (YYYY-MM-DD)");
                    String fechaEvento = scanner1.nextLine();
                    System.out.println("Desea especificar el lugar del evento (y/n)");
                    String opcionColocada = scanner1.nextLine(); // almacenando la opcion
                    if(opcionColocada.equals("y")) {
                        System.out.println("digite el lugar del evento: ");
                        String opcionSeleccionada = scanner1.nextLine();
                        evento = new Evento(nombreEvento, fechaEvento, opcionSeleccionada);
                    }else{
                        evento = new Evento(nombreEvento, fechaEvento);
                    }

                    System.out.println("cuantos invitados agregaras? ");
                    int cantidad_invitados = scanner1.nextInt();
                    scanner1.nextLine();
                    if(cantidad_invitados == 1) {
                        System.out.println("digite el nombre del invitado: ");
                        String invitado = scanner1.nextLine();
                        evento.agregarInvitado(invitado);
                    }

                    else if(cantidad_invitados > 1) {
                        for(int i = 0; i < cantidad_invitados; i++) {
                            System.out.println("Digite el nombre del invitado: ");
                            String invitado = scanner1.nextLine();
                            invitados.add(invitado);
                        }
                        evento.agregarInvitado(invitados); // agregando el array
                    }
                    else{
                        System.out.println("cantidad invalida");
                    }
                    eventos.add(evento);
                    System.out.println("evento creado correctamente");
                    break;

                    // fin del caso 1

                case 2:
                    for(Evento data_evento : eventos) {
                        System.out.println(data_evento.mostrarInformacion());
                    }
                    break;

                case 3:
                    System.out.println("Digite la fecha de los eventos que desea visualizar:");
                    String fechaColocada = scanner1.nextLine();

                    boolean encontrado = false;

                    for (Evento data_evento : eventos) {
                        if (data_evento.fecha.equals(fechaColocada)) {
                            System.out.println(data_evento.mostrarInformacion());
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontraron eventos con dicha fecha.");
                    }
                    break;


                case 4:
                    for(Evento data_evento : eventos) {
                        System.out.println("Evento: " + data_evento.nombre + " | lugar: " + data_evento.lugar);
                    }
                    break;


                case 5:
                    System.out.println("Digite el nombre del lugar de los eventos que desea visualizar:");
                    String lugarColocado = scanner1.nextLine();
                    boolean lugarEncontrado = false;

                    for (Evento data_evento : eventos) {
                        if (data_evento.lugar.equals(lugarColocado)) {
                            System.out.println(data_evento.mostrarInformacion());
                            lugarEncontrado = true;
                        }
                    }

                    if (!lugarEncontrado) {
                        System.out.println("No se encontraron eventos con dicha fecha.");
                    }
                    break;

                case 6:
                    System.out.println(Evento.mostrarCantidadEventos());
                    break;

                case 0:
                    System.out.println("saliendo...");
                    break;

                default:
                    System.out.println("opcion invalida");
                    break;
            }
        }
        while (opcion != 0);
        scanner1.close();
    }
}
