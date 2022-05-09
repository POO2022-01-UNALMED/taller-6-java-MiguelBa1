package vehiculos;
import java.util.ArrayList;
import java.util.HashMap;
public class Fabricante {
    private static ArrayList<Fabricante> listado = new ArrayList<>();
    private String nombre;
    private Pais pais;
    public Fabricante(String nombre, Pais pais) {
        this.nombre = nombre;
        this.pais = pais;
        listado.add(this);
    }

    public static Fabricante fabricaMayorVentas() {
		ArrayList<String> nombres = new ArrayList<>();
		for (Vehiculo vehiculo : Vehiculo.getVehiculos()) {
			nombres.add(vehiculo.getFabricante().getNombre());
		}
		HashMap<String, Integer> mapa = new HashMap<>();
		for (int x = 0; x < nombres.size(); x++) {
			String nombre = nombres.get(x);
			if (mapa.containsKey(nombre)) {
				mapa.put(nombre, mapa.get(nombre) + 1);
			} else {
				mapa.put(nombre, 1);
			}
		}
		
		String moda = "";
		int mayor = 0;
		for (HashMap.Entry<String, Integer> entry : mapa.entrySet()) {
			if (entry.getValue() > mayor) {
				mayor = entry.getValue();
				moda = entry.getKey();
			}
		}

		for (Fabricante fabricante : Fabricante.getFabricantes()) {
			if (fabricante.getNombre() == moda) {
				return fabricante;
			}
		}
        return null;
    }

    public static ArrayList<Fabricante> getFabricantes() {
        return listado;
    }

    public static void setVehiculos(ArrayList<Fabricante> listado) {
        Fabricante.listado = listado;
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
     * @return Pais return the pais
     */
    public Pais getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(Pais pais) {
        this.pais = pais;
    }

}
    
