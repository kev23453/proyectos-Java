package src.modules;

import java.util.ArrayList;
import java.util.Scanner;

public class agenciaAlquiler {
    private ArrayList<vehiculo> listaVehiculos;

    public agenciaAlquiler() {
        this.listaVehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(vehiculo vehiculoNuevo) {
        listaVehiculos.add(vehiculoNuevo);
        System.out.println("Vehículo: " + vehiculoNuevo.matricula + " agregado correctamente.");
    }

    public void eliminarVehiculo(String matricula) {
        listaVehiculos.removeIf(v -> v.matricula.equalsIgnoreCase(matricula));
        System.out.println("Vehículo eliminado (si existía).");
    }

    public void mostrarInformacion() {
        System.out.println("===== LISTA DE VEHÍCULOS =====");
        for (vehiculo vehiculoN : listaVehiculos) {
            System.out.println("Matrícula: " + vehiculoN.matricula +
                    " | Modelo: " + vehiculoN.modelo +
                    " | Marca: " + vehiculoN.marca +
                    " | Año: " + vehiculoN.año +
                    " | Estado: " + vehiculoN.estado);
        }
    }

    public void menu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("\n--- Menú de Agencia de Alquiler ---");
            System.out.println("1. Alquilar vehículo");
            System.out.println("2. Devolver vehículo");
            System.out.println("3. Mostrar información de vehículos");
            System.out.println("4. Salir");
            System.out.print("Opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> {
                    System.out.print("Ingrese matrícula del vehículo: ");
                    String mat = sc.nextLine();
                    for (vehiculo v : listaVehiculos) {
                        if (v.matricula.equalsIgnoreCase(mat)) {
                            if (v instanceof camioneta camioneta) {
                                System.out.print("¿Desea validar capacidad mínima? (s/n): ");
                                String resp = sc.nextLine();
                                if (resp.equalsIgnoreCase("s")) {
                                    System.out.print("Ingrese capacidad mínima (kg): ");
                                    double cap = sc.nextDouble();
                                    sc.nextLine();
                                    camioneta.alquilar(cap);
                                } else {
                                    camioneta.alquilar();
                                }
                            } else if (v instanceof auto auto) {
                                auto.alquilar();
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.print("Ingrese matrícula del vehículo: ");
                    String mat = sc.nextLine();
                    for (vehiculo v : listaVehiculos) {
                        if (v.matricula.equalsIgnoreCase(mat) && v instanceof IAlquiler alquiler) {
                            alquiler.devolver();
                        }
                    }
                }
                case 3 -> mostrarInformacion();
                case 4 -> System.out.println("Saliendo del sistema...");
                default -> System.out.println("Opción inválida.");
            }
        } while (opcion != 4);
        sc.close();
    }
}
