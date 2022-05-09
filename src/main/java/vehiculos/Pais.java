package vehiculos;

public class Pais {
    private String nombre;

    public Pais(String nombre) {
        this.nombre = nombre;
    }
    
    public static Pais paisMasVendedor() {
        return Fabricante.fabricaMayorVentas().getPais();
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

}
