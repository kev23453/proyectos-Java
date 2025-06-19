package src.modules;

public abstract class vehiculo {
    public String matricula;
    public String marca;
    public String modelo;
    public int año;
    public String estado;

    public vehiculo(String matricula, String marca, String modelo, int año, String estado) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.estado = estado;
    }
}