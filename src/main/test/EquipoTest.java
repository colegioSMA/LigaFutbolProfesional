package test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import lfp.Equipo;
import lfp.Jugador;



public class EquipoTest {
	List<Equipo> listaEquipos = null;
	List<Jugador> listaJugadores = null;
	Equipo equip1 = null;
	Equipo equip2 = null;
	Jugador jug1 = null;
	Jugador jug2 = null;
	
	@Before
	public void setUp() throws Exception {
		
		listaEquipos = new ArrayList<Equipo>();
		equip1 = new Equipo("real Zaragoza");
		equip2 = new Equipo("Leganés");
		
		listaEquipos.add(equip1);
		listaEquipos.add(equip2);
		
		
		listaJugadores = new ArrayList<Jugador>();
		
		jug1 = new Jugador(20, "Julia", "calle mayor", 1996, 'M', 2000, equip1);
		jug2 = new Jugador(34, "Agust", "Calle del Silencio", 1967, 'M', 2000, equip2);
		
		listaJugadores.add(jug1);
		listaJugadores.add(jug2);
		
		
		
	}
	@Test
	public void acta() {

		assertTrue(equip1.esEquipoReal());
		
		assertFalse(equip2.esEquipoReal());
	}
	
	@Test
	public void actb() {
		
		equip1.anadeJugador(jug1);
		equip1.anadeJugador(jug2);
		
		assertArrayEquals(listaJugadores.toArray(),equip1.getListaJugadores().toArray() );
			
	}
	
	
	
}
