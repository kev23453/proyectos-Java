package src.modules;

public class auto extends vehiculo implements IAlquiler {
    private int numero_puertas;

    public auto(String matricula, String marca, String modelo, int año, String estado, int puertas) {
        super(matricula, marca, modelo, año, estado);
        this.numero_puertas = puertas;
    }

    public auto(String matricula, int año){
        super(matricula, "Generico", "no proporcionado", año, "disponible");
        numero_puertas = 4;
    }

    @Override
    public void alquilar() {
        if(estado != "disponible") {
            System.out.println("el vehiculo no esta disponible");
        }else{
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
