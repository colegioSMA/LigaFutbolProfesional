package lfp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Liga {


	//Lista de arbitros de la liga
	private List<Arbitro> listaArbitros = null;

	//Lista de todos los equipos de la liga
	private List<Equipo> listaEquipos = null;
	//Atributo que indica la clasificaci�n de la liga
	// Equipo - puntos del equipo
	private Map<Equipo, Integer> clasificacion = null;
	
	
	public Liga(List<Equipo> listaEquipos) {
		
		
		listaArbitros = new ArrayList<Arbitro>();
		clasificacion = new HashMap<>();
		//Inicializamos la clasificaci�n
		//Todos los equipos con 0 puntos
		for (int i=0;i<listaEquipos.size();i++) {
			
			clasificacion.put(listaEquipos.get(i), 0);
		}
				
		
	}
	
	
	/**
	 * A�ade un equipo a la lista de equipos de la liga
	 * @param equipo
	 * @throws ExcepcionLiga
	 */
	public void addEquipo(Equipo equipo) throws ExcepcionLiga{
		if (!listaEquipos.contains(equipo)) {
			listaEquipos.add(equipo);
		}else {
			throw new ExcepcionLiga();
		}
	}
	/**
	 * A�ade un arbitro a la lista de arbitros de la liga
	 * @param arbitro
	 * @throws ExcepcionLiga
	 */
	public void addArbitro(Arbitro arbitro) throws ExcepcionLiga{
		if (!listaArbitros.contains(arbitro)) {
			listaArbitros.add(arbitro);
		}else {
			throw new ExcepcionLiga();
		}
	}
	/**
	 * M�todo que a partir de dos equipos (local y visitante) y los goles
	 * obtenidos por ambos equipos, se actualiza la clasificaci�n
	 * seg�n los puntos obtenidos.
	 * @param equipoLocal
	 * @param equipoVisitante
	 * @param golesLocal
	 * @param golesVisitante
	 * @throws NoExisteEquipoExcepcion
	 */
	public void juegaPartido(Equipo equipoLocal, Equipo equipoVisitante,
			int golesLocal, int golesVisitante) throws NoExisteEquipoExcepcion {
		
		int puntuacionObtenidaLocal = 
				puntuacionObtenidaLocal(golesLocal, golesVisitante);
		
		int puntuacionObtenidaVisitante = 
				puntuacionObtenidaLocal(golesLocal, golesVisitante);
		
		if (!clasificacion.containsKey(equipoLocal) || 
				!clasificacion.containsKey(equipoVisitante)) {
			throw new NoExisteEquipoExcepcion();
		}
		else {			
			clasificacion.put(equipoLocal, clasificacion.get(equipoLocal) + puntuacionObtenidaLocal);
			clasificacion.put(equipoVisitante, clasificacion.get(equipoVisitante) + puntuacionObtenidaVisitante);			
		}
		
	}
	
	
	/**
	 * Obtiene los puntos recibidos al equipo local seg�n
	 * los goles del equipo local y visitante
	 * @param golesLocal
	 * @param golesVisitante
	 * @return
	 */
	public int puntuacionObtenidaLocal(int golesLocal, int golesVisitante) {
		if (golesLocal > golesVisitante) {
			return 3;
		}
		else if (golesVisitante > golesLocal) {
			return 0;
		}
		else {
			return 1;
		}
	}
	
	/**
	 * Obtiene los puntos recibidos al equipo local seg�n
	 * los goles del equipo local y visitante
	 * @param golesLocal
	 * @param golesVisitante
	 * @return
	 */
	public int puntuacionObtenidaVisitante(int golesLocal, int golesVisitante) {
		if (golesLocal > golesVisitante) {
			return 0;
		}
		else if (golesVisitante > golesLocal) {
			return 3;
		}
		else {
			return 1;
		}
	}


	public List<Arbitro> getListaArbitros() {
		return listaArbitros;
	}


	public void setListaArbitros(List<Arbitro> listaArbitros) {
		this.listaArbitros = listaArbitros;
	}


	public List<Equipo> getListaEquipos() {
		return listaEquipos;
	}


	public void setListaEquipos(List<Equipo> listaEquipos) {
		this.listaEquipos = listaEquipos;
	}


	public Map<Equipo, Integer> getClasificacion() {
		return clasificacion;
	}


	public void setClasificacion(Map<Equipo, Integer> clasificacion) {
		this.clasificacion = clasificacion;
	}
	
}
