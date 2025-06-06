package modules;

public class producto {
    public String nombre;
    public double precio;
    public int cantidad;

    public static double productosCreados;

    public producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public void agregarCantidad(double cantidad) {
        this.cantidad += cantidad;
    }

    public void vender(double cantidad) {
        if(cantidad > this.cantidad) {
            System.out.println("cantidad invalida, articulos insuficientes");
        }
        else{
            this.cantidad -= cantidad;
        }
    }

    public String toString() {
        return "producto: " + nombre + ", precio: " + precio + ", cantidad actual: " + cantidad;
    }

}
