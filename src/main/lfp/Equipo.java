package lfp;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

	private static int contador = 0;
	private int identificador = 0;
	private String nombre;
	//Lista de jugadores del equipo
	private List<Jugador> listaJugadores = null;
	public Equipo(String nombre) {
		super();
		this.listaJugadores = new ArrayList<>();
		this.identificador = ++contador;
		this.nombre = nombre;
	}
	
	public void anadeJugador(Jugador jugador) {
		if (!listaJugadores.contains(jugador)) {
				listaJugadores.add(jugador);
		}
		
	}
	/**
	 * Si el equipo tiene como prefijo la plabra REAL, 
	 * es equipo real.
	 * Ejemplo: Real Madrid, Real Valladolid, Real Zaragoza, ...
	 * @return
	 */
	public boolean esEquipoReal() {
		return this.nombre.toLowerCase().startsWith("real");
		
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + identificador;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Equipo && 
				((Equipo)obj).nombre.equals(this.nombre) &&
				((Equipo)obj).listaJugadores.equals(this.listaJugadores)){
					return true;
				}
				return false;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Jugador> getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(List<Jugador> listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	
	
}
