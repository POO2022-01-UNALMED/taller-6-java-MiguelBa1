package vehiculos;
import java.util.ArrayList;

public class Camioneta extends Vehiculo { 
    private static ArrayList<Camioneta> listado = new ArrayList<>();
    private boolean volco;

    public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        listado.add(this);
    }

    public static ArrayList<Camioneta> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Camioneta> listado) {
        Camioneta.listado = listado;
    }

    /**
     * @return boolean return the volco
     */
    public boolean isVolco() {
        return volco;
    }

    /**
     * @param volco the volco to set
     */
    public void setVolco(boolean volco) {
        this.volco = volco;
    }

}