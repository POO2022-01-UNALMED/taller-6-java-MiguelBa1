package vehiculos;
import java.util.ArrayList;

public class Vehiculo {
    private static ArrayList<Vehiculo> listado = new ArrayList<>();
    private String placa;
    private int puertas;
    private int velocidadMaxima;
    private String nombre;
    private int precio;
    private int peso;
    private String traccion;
    private Fabricante fabricante;
    private static int cantidadVehiculos;
    public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
        this.placa = placa;
        this.puertas = puertas;
        this.velocidadMaxima = velocidadMaxima;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.traccion = traccion;
        this.fabricante = fabricante;
        Vehiculo.cantidadVehiculos += 1;
        listado.add(this);
    }
    
    public static ArrayList<Vehiculo> getVehiculos() {
        return listado;
    }

    public static void setVehiculos(ArrayList<Vehiculo> listado) {
        Vehiculo.listado = listado;
    }

    public static String vehiculosPorTipo() {
        return "Automoviles: "+Automovil.getListado().size()+"\n" + 
				"Camionetas: "+Camioneta.getListado().size()+"\n" + 
				"Camiones: "+Camion.getListado().size()+"\n"; 
    }

    public static void setCantidadVehiculos(int cantidadVehiculos) {
        Vehiculo.cantidadVehiculos = cantidadVehiculos;
    } 

    public static int getCantidadVehiculos() {
        return Vehiculo.cantidadVehiculos;
    }
    /**
     * @return String return the placa
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * @param placa the placa to set
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * @return int return the puertas
     */
    public int getPuertas() {
        return puertas;
    }

    /**
     * @param puertas the puertas to set
     */
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    /**
     * @return int return the velocidadMaxima
     */
    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    /**
     * @param velocidadMaxima the velocidadMaxima to set
     */
    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    /**
     * @return String return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return int return the precio
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
     * @return int return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return String return the traccion
     */
    public String getTraccion() {
        return traccion;
    }

    /**
     * @param traccion the traccion to set
     */
    public void setTraccion(String traccion) {
        this.traccion = traccion;
    }

    /**
     * @return String return the fabricante
     */
    public Fabricante getFabricante() {
        return fabricante;
    }

    /**
     * @param fabricante the fabricante to set
     */
    public void setFabricante(Fabricante fabricante) {
        this.fabricante = fabricante;
    }

}
