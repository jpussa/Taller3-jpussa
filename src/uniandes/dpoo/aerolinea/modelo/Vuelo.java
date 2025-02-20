package uniandes.dpoo.aerolinea.modelo;
import java.util.Collection;
import java.util.HashSet;

import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public class Vuelo {
    private String fecha;
    private Ruta ruta;
    private Avion avion;
    private Collection<Tiquete> tiquetes;
    private Boolean terminado;

    public Vuelo(Ruta ruta, String fecha, Avion avion) {
        this.ruta = ruta;
        this.fecha = fecha;
        this.avion = avion;
        this.tiquetes = new HashSet<>();
        this.terminado = false;
    }

    public String getFecha() {
        return fecha;
    }

    public Ruta getRuta() {
        return ruta;
    }

    public Avion getAvion() {
        return avion;
    }

    public void agregarTiquete(Tiquete tiquete) {
        tiquetes.add(tiquete);
    }

    public Collection<Tiquete> getTiquetes() {
        return tiquetes;
    }

	public void marcarRealizado() {
		this.terminado = true;
		
	}
}
