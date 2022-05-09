package vehiculos;

public class Automovil extends Vehiculo {
    private int puestos;
    public Automovil(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, String fabricante, int puestos) {
        super(placa, 4, 100, nombre, precio, peso, "FWD", fabricante);
        this.puestos = puestos;
    }
}
