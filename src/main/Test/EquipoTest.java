package Test;


import lfp.Arbitro;
import lfp.Equipo;
import lfp.ExcepcionLiga;
import lfp.Jugador;
import lfp.Liga;
import lfp.NoExisteEquipoExcepcion;
import lfp.Persona;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

class EquipoTest {
	Arbitro arbitro1 = null;
	Equipo equipo1 = null;
	Equipo equipo2 = null;
	ExcepcionLiga excepcion1 = null;
	Jugador jugador1 = null;
	Liga liga1 = null;
	NoExisteEquipoExcepcion noExiste1 = null;
	Persona persona1 = null;
		

	
	
	@Before
	public void setUp() throws Exception {
		equipo1 = new Equipo("RealMadrid");
		equipo2 = new Equipo("Betis");
		jugador1 = new Jugador(21,"Juan","avenida tomate",1998,'M',1000.21,equipo1);
		
		ArrayList<Jugador> jugadores = new ArrayList<>();
		jugadores.add(jugador1);
		
	}

	@Test
	public void esEquipoReal() {
	
		//deberia comprobar que sus nombres contengan real
		assertTrue(equipo1.esEquipoReal());
		assertFalse(equipo2.esEquipoReal());
	}

	@Test
	public void anadeJugador() {
		//realiza una comprobacion entre los arrays
		ArrayList<Jugador> jugadores1 = new ArrayList<>();
		jugadores1.add(jugador1);
		equipo2.anadeJugador(jugador1);
		assertArrayEquals(jugadores1.toArray(), equipo2.getListaJugadores().toArray());
	}
	
	
}
