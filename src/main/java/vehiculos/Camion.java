package vehiculos;
import java.util.ArrayList;

public class Camion extends Vehiculo {
    private static ArrayList<Camion> listado = new ArrayList<>();
    private int ejes;
    public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
        super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
        this.ejes = ejes;
        listado.add(this);
    }

    public static ArrayList<Camion> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Camion> listado) {
        Camion.listado = listado;
    }

    /**
     * @return int return the ejes
     */
    public int getEjes() {
        return ejes;
    }

    /**
     * @param ejes the ejes to set
     */
    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

}