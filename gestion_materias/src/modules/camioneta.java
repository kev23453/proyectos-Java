package src.modules;

public class camioneta extends vehiculo implements IAlquiler {
    private double capacidad_carga;

    public camioneta(String matricula, String marca, String modelo, int año, String estado, double capacidad_carga) {
        super(matricula, marca, modelo, año, estado);
        this.capacidad_carga = capacidad_carga;
    }

    public camioneta(String matricula, String marca, int año) {
        super(matricula, marca, "no proporcionado", año, "disponible");
        capacidad_carga = 120;
    }

    @Override
    public void alquilar() {
        if(estado != "disponible") {
            System.out.println("el vehiculo no esta disponible");
        }else{
            estado = "alquilado";
        }
    }


    public void alquilar(double capacidad_minima) {
        if(capacidad_carga < capacidad_minima) {
            System.out.println("este vehiculo no cumple con la carga minima para ser alquilado");
        } else if (estado != "disponible") {
            System.out.println("este vehiculo no esta disponible");
        }else {
            estado = "alquilado";
        }
    }

    @Override
    public void devolver() {
        if(estado == "alquilado") {
            estado = "disponible";
        }else{
            System.out.println("este vehiculo no ha sido alquilado");
        }
    }

}
