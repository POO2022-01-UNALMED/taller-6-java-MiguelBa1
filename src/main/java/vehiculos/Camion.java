package vehiculos;

public class Camion extends Vehiculo {
    private int ejes;
    public Camion(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, String fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4x2", fabricante);
        this.ejes = ejes;
    }
}