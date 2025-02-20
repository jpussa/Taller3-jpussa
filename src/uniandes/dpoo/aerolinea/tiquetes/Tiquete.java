package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete {
	private String codigo;
	private Vuelo vuelo;
	private Cliente clienteComprador;
	private int tarifa;
	private boolean usado;
	
	
    public Tiquete(String codigo, Vuelo vuelo, Cliente clienteComprador, int tarifa) {
        this.codigo = codigo;
        this.vuelo = vuelo;
        this.clienteComprador = clienteComprador;
        this.tarifa = tarifa;
        this.usado = false;
    }
	
	public Cliente getCliente(List<Cliente> clientes) {
		for(Cliente cliente : clientes) {
			if (cliente.getIdentificador()) {
				return cliente;
			}
		}
	}

    public String getCodigo() {
        return codigo;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }

    public Cliente getClienteComprador() {
        return clienteComprador;
    }

    public int getTarifa() {
        return tarifa;
    }

    public boolean isUsado() {
        return usado;
    }

    public void marcarComoUsado() {
        this.usado = true;
    }
}
