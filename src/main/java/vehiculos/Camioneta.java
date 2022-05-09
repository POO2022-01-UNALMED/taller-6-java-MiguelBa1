package vehiculos;

public class Camioneta extends Vehiculo { 
    private boolean volco;

    public Camioneta(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, String fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4x4", fabricante);
        this.volco = volco;
    }
}