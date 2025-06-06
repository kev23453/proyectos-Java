package app;
import modules.producto;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <producto> productos = new ArrayList<>();
        productos.add(new producto("Perfume invictus rabane", 6000, 8));
        productos.add(new producto("pc victus", 50000, 3));

        Scanner scanner1 = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n----- MENÚ DE OPCIONES -----");
            System.out.println("1. Agregar cantidad");
            System.out.println("2. Vender producto");
            System.out.println("3. Mostrar productos");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner1.nextInt();
            scanner1.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("digite el indice del numero que desea agregar la cantidad: ");
                    int producto_add = scanner1.nextInt();
                    System.out.println("cuanto desea agregarle a este producto? : ");
                    int cantidad_add = scanner1.nextInt();
                    productos.get(producto_add).agregarCantidad(cantidad_add);
                    System.out.println("cantidad agregada");
                    break;
                case 2:
                    System.out.println("digite el indice del numero que desea vender: ");
                    int productoVender = scanner1.nextInt();
                    System.out.println("cuanto desea vender? : ");
                    int cantidadVender = scanner1.nextInt();
                    productos.get(productoVender).vender(cantidadVender);
                    System.out.println("cantidad vendida");
                    break;
                case 3:
                    for(producto data_producto : productos) {
                        System.out.println(data_producto.toString());
                    }
                    break;
                case 0:
                    System.out.println("saliendo...");
                    break;
                default:
                    System.out.println("la opcion colocada no se encuentra en el menu");
            }
        }
        while (opcion != 0);
        scanner1.close();
    }
}