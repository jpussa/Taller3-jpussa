package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.Map;
import java.util.Map.Entry;

public class ClienteNatural extends Cliente {
	public static final String NATURAL = "Natural" ;
	private String nombre;
	
    public ClienteNatural(String identificador, String nombre) {
        super(identificador);
        this.nombre = nombre;
    }
	
	public String getIdentificador(Map<String, ClienteNatural> mapa) {
		for (Entry<String, ClienteNatural> entry : mapa.entrySet()) {
			if (entry.getValue() == this) {
				return entry.getKey();
			}
			
		}
		return null;
	}
	
    public String getNombre() {
        return nombre;
    }
	public String getTipoCliente() {
		return NATURAL;
	}

}
