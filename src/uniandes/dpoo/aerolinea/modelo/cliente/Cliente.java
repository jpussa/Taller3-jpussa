package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	protected String identificador;
	protected List<Tiquete> tiquetes;
	
	public Cliente(String identificador) {
		this.identificador = identificador;
		this.tiquetes = new ArrayList<>();
	}
	
	   public String getIdentificador() {
	        return identificador;
	    }
    public void agregarTiquete(Tiquete tiquete) {
        tiquetes.add(tiquete);
    }
	
	
    public int calcularValorTotalTiquetes() {
        int total = 0;
        for (Tiquete tiquete : tiquetes) {
            total += tiquete.getTarifa();
        }
        return total;
    }
	
    public void usarTiquetes(Vuelo vuelo) {
        for (Tiquete tiquete : tiquetes) {
            if (tiquete.getVuelo().equals(vuelo) && !tiquete.isUsado()) {
                tiquete.marcarComoUsado();
            }
        }
    }

    public abstract String getTipoCliente();
	

}
